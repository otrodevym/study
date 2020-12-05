package com.otrodevym.boot_test.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.otrodevym.boot_test.domain.Book;

@Service
public class BookRestService {
	
	private final RestTemplate restTemplate;

	public BookRestService(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.rootUri("/rest/test").build();
	}
	public Book getRestBook() {
		return this.restTemplate.getForObject("/rest/test", Book.class);
	}

}
