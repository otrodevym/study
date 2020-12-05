package com.otrodevym.test.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.otrodevym.test.aop.SampleAopBean;

public class AspectApp {
	public static void main(String args[]) {
//		ApplicationContext ac = new ClassPathXmlApplicationContext("aopbean.xml");
		ApplicationContext ac = new AnnotationConfigApplicationContext(SampleAspectConfig.class);
		
		SampleAopBean sab = (SampleAopBean)ac.getBean("sampleAopBean");
		String msg = sab.getMessage();
		sab.setMessage(msg);
		sab.printMaessag();
		
	}
}
