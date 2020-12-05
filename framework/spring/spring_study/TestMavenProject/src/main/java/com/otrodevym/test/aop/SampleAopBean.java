package com.otrodevym.test.aop;

public class SampleAopBean {
	private String message;
	public SampleAopBean() {
		super();
	}
	
	public SampleAopBean(String message) {
		super();
		this.message = message;
	}
	public String getMessage() {
		return this.message = message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	public void printMaessag() {
		System.out.println("message:[" + message +"]");
	}
}
