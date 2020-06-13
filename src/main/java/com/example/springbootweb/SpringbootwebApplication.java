package com.example.springbootweb;

import com.example.springbootweb.servlet.SecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ServletComponentScan	// 在Spring Boot启动使会扫描@WebServlet,@WebFilter,@WebListener注解，并将该类实例化
public class SpringbootwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootwebApplication.class, args);
	}


}
