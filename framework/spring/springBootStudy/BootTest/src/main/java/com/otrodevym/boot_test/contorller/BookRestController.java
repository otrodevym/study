package com.otrodevym.boot_test.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.otrodevym.boot_test.domain.Book;
import com.otrodevym.boot_test.service.BookRestService;

@RestController
public class BookRestController {

	@Autowired
	private BookRestService bookRestService;
	
	@GetMapping(path="/test/test", produces=MediaType.APPLICATION_JSON_VALUE)
	public Book getRestBooks() {
		return bookRestService.getRestBook();
	}
	
}
