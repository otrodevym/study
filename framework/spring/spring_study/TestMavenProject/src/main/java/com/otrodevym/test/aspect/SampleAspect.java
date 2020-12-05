package com.otrodevym.test.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SampleAspect {
	@Before("execution(* com.otrodevym.test.aop.SampleAopBean.*(..))")
	public void before() {
		System.out.println("before");
	}
	
	@After("execution(* com.otrodevym.test.aop.SampleAopBean.*(..))")
	public void after() {
		System.out.println("after");
	}
}
