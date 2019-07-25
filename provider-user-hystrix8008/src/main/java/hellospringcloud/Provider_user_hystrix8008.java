package hellospringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker  //开启熔断器
public class Provider_user_hystrix8008 {

    public static void main(String[] args) {
        SpringApplication.run(Provider_user_hystrix8008.class, args);
    }

}
