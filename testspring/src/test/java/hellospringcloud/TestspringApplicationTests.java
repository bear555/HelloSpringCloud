package hellospringcloud;

import hellospringcloud.configBean.HelloSpringboot;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestspringApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void t1() {
        HelloSpringboot helloSpringboot=new HelloSpringboot();
        helloSpringboot.sayHello();
    }

}
