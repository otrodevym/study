package com.otrodevym.web.event;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import com.otrodevym.web.domain.Board;

@RepositoryEventHandler(Board.class)
public class BoardEventHandler {
	@HandleBeforeCreate
	public void beforeCreateBoard(Board board) {
		board.setCreatedDateNow();
	}
	
	@HandleBeforeSave
	public void beforeSaveBoard(Board board) {
		board.setUpdatedDateNow();
	}
}
