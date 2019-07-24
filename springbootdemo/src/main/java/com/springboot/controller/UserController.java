package com.springboot.controller;

import com.springboot.entity.User;
import com.springboot.sevice.IUserSevice;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserSevice userSevice;

    @Autowired
    private DiscoveryClient client;

    @ApiOperation(value="获取用户详细信息", notes="获取用户详细信息")
    @RequestMapping("/user/list")
    @ResponseBody
    public List<User> listUser(){
        return userSevice.listUsers();
    }

    @RequestMapping("/testHtml")
    public ModelAndView testHtml(){

        ModelAndView mv=new ModelAndView();

        List<User> list =userSevice.listUsers();

        mv.getModel().put("testList",list);

        mv.setViewName("test");

        return mv;
    }


    /**
     * @Description  服务发现
     * @Author  ChenWeixong
     * @Date   2019/7/24 16:04
     * @Param
     * @Return
     * @Exception
     * */
    @RequestMapping(value = "/user/discovery", method = RequestMethod.GET)
    public Object discovery()
    {
        List<String> list = client.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;
    }
}
