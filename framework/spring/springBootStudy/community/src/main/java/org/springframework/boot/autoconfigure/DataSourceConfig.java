package org.springframework.boot.autoconfigure;

import javax.servlet.Servlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
	@Bean
	ServletRegistrationBean<Servlet> h2servletRegistration() {
		ServletRegistrationBean<Servlet> registrationBean = 
				new ServletRegistrationBean<Servlet>();
		registrationBean.addUrlMappings("/console/*");
		return registrationBean;
	}
}
