package com.otrodevym.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.otrodevym.web.domain.Board;
import com.otrodevym.web.domain.User;

public interface BoardRepository extends JpaRepository<Board, Long>{

	Board findByUser(User user);

}
