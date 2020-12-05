package com.otrodevym.web.domain.projection;

import org.springframework.data.rest.core.config.Projection;

import com.otrodevym.web.domain.Board;

@Projection(name ="getOnlyTitle", types = {Board.class})
public interface BoardOnlyContainTitle {
	String getTitle();
}
