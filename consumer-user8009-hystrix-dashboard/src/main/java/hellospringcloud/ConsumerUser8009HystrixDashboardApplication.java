package hellospringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class ConsumerUser8009HystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerUser8009HystrixDashboardApplication.class, args);
    }

}
