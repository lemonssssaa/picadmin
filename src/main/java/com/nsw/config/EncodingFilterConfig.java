package com.nsw.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;


/**
 * @author WengQiZhi
 * @BelongsPackage springbootday
 * @date 2019-10-30 10:19
 * @Description: todo
 */
@Configuration
public class EncodingFilterConfig {
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean registrationBean=new FilterRegistrationBean();
        CharacterEncodingFilter characterEncodingFilter=new CharacterEncodingFilter();
        characterEncodingFilter.setForceEncoding(true);
        characterEncodingFilter.setEncoding("Utf-8");
        registrationBean.setFilter(characterEncodingFilter);
        return registrationBean;
    }
}
