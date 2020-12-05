package com.otrodevym.boot_test.BookRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.otrodevym.boot_test.domain.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
