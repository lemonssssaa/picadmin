package com.nsw.config;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * @author WengQiZhi
 * @BelongsPackage springbootday
 * @date 2019-10-25 10:31
 * @Description: todo
 */
@Configuration
public class MyPageConfig {
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                ErrorPage errorPage=new ErrorPage(HttpStatus.OK,"/index");
                factory.addErrorPages(errorPage);
            }
        };
    }
}