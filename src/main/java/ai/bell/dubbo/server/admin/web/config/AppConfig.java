package ai.bell.dubbo.server.admin.web.config;

import ai.bell.dubbo.server.admin.common.helper.ApplicationContextHelper;
import org.apache.dubbo.config.spring.extension.SpringExtensionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Mabowen
 * @date 2020-07-01 11:42
 */
@Configuration
public class AppConfig {
    @Bean
    public ApplicationContextHelper applicationContextHelper() {
        return new ApplicationContextHelper();
    }
 }
