package com.otrodevym.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanApp {

	public static void main(String args[]) {
//		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//		ApplicationContext ac = new AnnotationConfigApplicationContext(SampleBean.class);
//		SampleBeanInterface sample = (SampleBeanInterface)ac.getBean("bean1");
//		System.out.println(sample);

//		ApplicationContext ac = new AnnotationConfigApplicationContext(SampleBeanConfig.class);
//			SampleBeanInterface bean = (SampleBeanInterface)ac.getBean(SampleBeanInterface.class);
//			System.out.println(bean);

		ApplicationContext ac = new AnnotationConfigApplicationContext(SampleBeanConfig.class);
		BeanHolder holder = ac.getBean(BeanHolder.class);
		holder.showMessage();
	}
}
