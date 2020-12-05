package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestValueApplication {
	
	@Value("${property.test.name}")
	private String  pName;
	
	@Value("#{'${propertyTestList}'.split(',')}")
	private String propertyTestList;

	@Autowired
	private FruitProperty fruitProperty;
	
	public static void main(String[] args) {
		SpringApplication.run(TestValueApplication.class, args);
	}
	
	@GetMapping
	public String hello() {
		System.out.println(" >> " + pName);
		System.out.println(" >> " + propertyTestList.toString());
		System.out.println(" >> " + fruitProperty.toString());
		return "hellow world!!";
	}

}
