package com.otrodevym.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SampleBeanConfig {
	
	@Bean
	public SampleBean sampleBean() {
		return new SampleBean("this is sampleBean.");
	}
}
