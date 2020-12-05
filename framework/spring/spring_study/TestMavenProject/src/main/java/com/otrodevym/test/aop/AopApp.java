package com.otrodevym.test.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopApp {
	public static void main(String args[]) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		
		SampleAopBean bean1 = (SampleAopBean) ac.getBean("sampleAopBean");
		bean1.printMaessag();
		
		System.out.println("----------------------");
		
		SampleAopBean bean2 = (SampleAopBean) ac.getBean("proxyFactoryBean");
		bean2.printMaessag();
		
		ApplicationContext ac2 = new AnnotationConfigApplicationContext(SampleAopConfig.class);
		
		SampleAopBean bean3 = (SampleAopBean) ac.getBean("sampleAopBean");
		bean1.printMaessag();
		
		System.out.println("----------------------");
		
		SampleAopBean bean4 = (SampleAopBean) ac.getBean("proxyFactoryBean");
		bean2.printMaessag();
	}
}
