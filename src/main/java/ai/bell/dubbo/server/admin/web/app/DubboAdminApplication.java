package ai.bell.dubbo.server.admin.web.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Mabowen
 * @date 2020-07-01 11:00
 */
@SpringBootApplication
@ComponentScan(basePackages = "ai.bell.dubbo.server.admin")
//@EnableDubbo(scanBasePackages = "ai.bell.dubbo.server.admin")
public class DubboAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboAdminApplication.class, args);
    }

}
