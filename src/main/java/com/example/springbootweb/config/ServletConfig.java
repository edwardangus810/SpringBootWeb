package com.example.springbootweb.config;

import com.example.springbootweb.servlet.SecondServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Servlet 配置类
 */
@Configuration      // 配置Servlet组件
public class ServletConfig {
    /**
     * 完成Servlet组件的注册
     */
    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
        bean.addUrlMappings("/second");
        return bean;
    }

}
