package hellospringcloud.controller;


import hellospringcloud.entities.User;
import hellospringcloud.service.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController_consumer {

    @Autowired
    private UserClientService service;


    /**
     * @Description restful 风格 listUser
     * @Author  ChenWeixong
     * @Date   2019/7/25 15:57
     * @Param
     * @Return
     * @Exception
     * */

    @RequestMapping(value = "/consumer/user/list",method = RequestMethod.GET)
    public List<User> listUser(){
        return service.listUsers();
    }
}
