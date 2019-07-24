package hellospringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerUser8004Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerUser8004Application.class, args);
    }

}
