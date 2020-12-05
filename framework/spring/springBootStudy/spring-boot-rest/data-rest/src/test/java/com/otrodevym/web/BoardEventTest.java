package com.otrodevym.web;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.otrodevym.web.domain.Board;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DataRestApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@AutoConfigureTestDatabase
public class BoardEventTest {
	private TestRestTemplate testRestTemplate = new TestRestTemplate("havi", "test");

	
	@Test
	public void 저장할때_이벤트가_적용되어_생성날짜가_생성되는가() {
		Board createdBoard = createBoard();
		assertNotNull(createdBoard.getCreatedDate());
	}


	private Board createBoard() {
		Board board = Board.builder().title("저장 이벤트 테스트").build();
		return testRestTemplate.postForObject("http://localhost:8081/api/boards", board, Board.class);
	}
	
	@Test
	public void 수정할때_이벤트가_적용되어_수정날짜가_생성되는가() {
		Board createBoard = createBoard();
		Board updateBoard = updateBoard(createBoard);
		assertNotNull(updateBoard.getUpdatedDate());
	}


	private Board updateBoard(Board createBoard) {
		String updateUri = "http://localhost:8081/api/boards/1";
		testRestTemplate.put(updateUri, createBoard);
		return testRestTemplate.getForObject(updateUri, Board.class);
	}
	
}