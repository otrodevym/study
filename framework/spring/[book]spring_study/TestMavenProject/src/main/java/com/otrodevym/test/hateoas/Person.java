package com.otrodevym.test.hateoas;

import org.springframework.hateoas.ResourceSupport;

public class Person extends ResourceSupport {
	private int personId;
	private String name;
	private String address;

	public Person() {
	}

	public Person(int personId, String name, String address) {
		super();
		this.personId = personId;
		this.name = name;
		this.address = address;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
