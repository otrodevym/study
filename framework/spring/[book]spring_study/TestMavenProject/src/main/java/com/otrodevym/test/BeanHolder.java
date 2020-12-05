package com.otrodevym.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanHolder {
	
	@Autowired
	private SampleBeanInterface sampleBean;
	
	public void showMessage() {
		System.out.println("sampleBean holder");
		System.out.println(sampleBean);
	}
}
