package hellospringcloud.configBean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(HelloSpringboot.class)
public class helloSpringConfig {

    @Bean
    @ConditionalOnMissingBean(HelloSpringboot.class)
    public HelloSpringboot hello(){
        return new HelloSpringboot();
    }
}
