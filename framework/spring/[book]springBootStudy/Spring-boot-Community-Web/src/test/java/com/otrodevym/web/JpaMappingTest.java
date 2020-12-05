package com.otrodevym.web;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.otrodevym.web.domain.Board;
import com.otrodevym.web.domain.User;
import com.otrodevym.web.domain.enums.BoardType;
import com.otrodevym.web.repository.BoardRepository;
import com.otrodevym.web.repository.UserRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class JpaMappingTest {
	private final String boardTestTitle = "테스트";
	private final String email = "test@gmail.com";

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BoardRepository boardRepository;

	@Before
	public void init() {
		User user = userRepository.save(
				User.builder()
				.name("ym")
				.password("test")
				.email(email)
				.createdDate(LocalDateTime.now())
				.build());	
		boardRepository.save(
				Board.builder()
				.title(boardTestTitle)
				.subTitle("서브 타이틀")
				.content("콘텐츠")
				.boardType(BoardType.free)
				.createdDate(LocalDateTime.now())
				.updatedDate(LocalDateTime.now())
				.user(user).build()
				);
		}
	
	@Test
	public void 제대로_생성됐는지_테스트() {
		User user = userRepository.findByEmail(email);
		assertThat(user.getName(), is("ym"));
		assertThat(user.getPassword(), is("test"));
		assertThat(user.getEmail(), is(email));
		
		Board board = boardRepository.findByUser(user);
		assertThat(board.getTitle(), is(boardTestTitle));
		assertThat(board.getSubTitle(), is("서브 타이틀"));
		assertThat(board.getContent(), is("콘텐츠"));
		assertThat(board.getBoardType(), is(BoardType.free));
		
	}

}
