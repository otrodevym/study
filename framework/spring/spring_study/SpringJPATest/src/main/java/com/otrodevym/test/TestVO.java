package com.otrodevym.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Configurable;

@Entity
@Table(name="test")
public class TestVO {
	
	@Id
	@Column
	private String test;
	
	@Column
	private String name;
	
	@Column(name="test_id")
	private String testId;
	
	public TestVO() {
	}

	public TestVO(String test) {
		super();
		this.test = test;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}
	
	
}
