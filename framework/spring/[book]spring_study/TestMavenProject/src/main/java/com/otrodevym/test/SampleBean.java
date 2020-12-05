package com.otrodevym.test;

public class SampleBean implements SampleBeanInterface{
	private String message;
	
	public SampleBean() {
		message = "massage";
	}

	public SampleBean(String message) {
		this.message = message; 
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
	
	@Override
	public String toString() {
		return "SampleBean [message=" + message + "]"; 
	}
}
