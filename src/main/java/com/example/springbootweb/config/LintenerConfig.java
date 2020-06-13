package com.example.springbootweb.config;

import com.example.springbootweb.listener.SecondListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

/**
 * Listener配置类
 */
@Configuration
public class LintenerConfig {

    @Bean
    public ServletListenerRegistrationBean getServletListenerRegistrationBean(){
        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean(new SecondListener());
        return bean;
    }
   
}
