package com.otrodevym.boot_test.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.otrodevym.boot_test.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public String getBook(Model model) {
		model.addAttribute("bookList", bookService.getBookList());
		return "book";
	}
}
