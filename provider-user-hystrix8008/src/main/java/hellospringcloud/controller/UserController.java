package hellospringcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import hellospringcloud.entities.User;
import hellospringcloud.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/user/list",method = RequestMethod.GET)
    public List<User> listUser(){
        return userService.listUsers();
    }


    @RequestMapping(value = "/user/get/{id}",method = RequestMethod.GET)
    //一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public User getUser(@PathVariable("id") int id){
        User user= userService.getUser(id);
        if (user==null){
            throw new RuntimeException("该ID"+id+"没有对应的信息");
        }
        return user;
    }

    public User processHystrix_Get(@PathVariable("id") int id){
//        System.out.println("没有该信息");
        return userService.getUser(1);
    }
}
