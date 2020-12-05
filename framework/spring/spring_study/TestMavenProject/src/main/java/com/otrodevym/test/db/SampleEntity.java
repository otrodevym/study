package com.otrodevym.test.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SampleEntity {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	
	@Column(length=50, nullable=false)
	private String name;
	
	@Column(length=100, nullable=true)
	private String mail;
	
	public SampleEntity() {
	}
	

	public SampleEntity(String name, String mail) {
		super();
		this.name = name;
		this.mail = mail;
	}


	public SampleEntity(String id, String name, String mail) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "SampleEntity [id=" + id + ", name=" + name + ", mail=" + mail + "]";
	}
	
	
	
	
}
