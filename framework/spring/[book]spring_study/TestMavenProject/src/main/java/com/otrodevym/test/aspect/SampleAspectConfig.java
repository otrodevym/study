package com.otrodevym.test.aspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.otrodevym.test.aop.SampleAopBean;

@Configuration
@EnableAspectJAutoProxy
public class SampleAspectConfig {

	@Bean
	SampleAopBean sampleAopBean() {
		return new SampleAopBean("this is aop Bean");
	}
	
	@Bean
	public SampleAspect sampleAspect() {
		return new SampleAspect();
	}
	
	
}
