package com.otrodevym.web;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.otrodevym.web.domain.Board;
import com.otrodevym.web.domain.User;
import com.otrodevym.web.domain.enums.BoardType;
import com.otrodevym.web.repository.BoardRepository;
import com.otrodevym.web.repository.UserRepository;

//@Component
public class WebRunner implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BoardRepository boardRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		User user = userRepository.save(
				User.builder()
				.name("ym")
				.password("test")
				.email("ym@gmail.com")
				.createdDate(LocalDateTime.now())
				.build());
		
		  IntStream.rangeClosed(1, 200).forEach(index -> 
		  	boardRepository.save(Board.builder()
		  	.title("게시글"+index)
		  	.subTitle("순서"+index)
		  	.content("콘텐츠")
		  	.boardType(BoardType.free)
		  	.createdDate(LocalDateTime.now())
		  	.updatedDate(LocalDateTime.now())
		  	.user(user).build() ));
		 
	}

	
}
