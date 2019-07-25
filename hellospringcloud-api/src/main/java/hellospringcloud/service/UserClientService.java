package hellospringcloud.service;

import hellospringcloud.entities.User;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


/**
 *
 * @Description: 修改microservicecloud-api工程，根据已经有的DeptClientService接口
        新建一个实现了FallbackFactory接口的类DeptClientServiceFallbackFactory
 * @author zzyy
 */
@FeignClient(value = "EUREKA-CLIENT-USER")  //面向微服务的接口编程
public interface UserClientService {


    /**
     * @Description 获取user列表
     * @Author  ChenWeixong
     * @Date   2019/7/25 15:48
     * @Param
     * @Return
     * @Exception
     * */
    @RequestMapping(value="/user/list",method= RequestMethod.GET )
     List<User> listUsers();
}
