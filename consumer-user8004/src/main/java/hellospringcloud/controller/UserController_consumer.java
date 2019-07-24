package hellospringcloud.controller;

import com.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController_consumer {

//    private static final String REST_URL_PREFIX = "http://localhost:8003";

    //寻找调用生产者的微服务名字
    private static final String REST_URL_PREFIX="http://eureka-client-user";

//    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";

    /**
     * 使用 使用restTemplate访问restful接口非常的简单粗暴无脑。 (url, requestMap,
     * ResponseBean.class)这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
     */
    @Autowired
    private RestTemplate restTemplate;

    @SuppressWarnings("unchecked")
    @RequestMapping(value="/consumer/user/list")
    public List<User> list(){
        return restTemplate.getForObject(REST_URL_PREFIX +"/user/list",List.class);
    }


}
