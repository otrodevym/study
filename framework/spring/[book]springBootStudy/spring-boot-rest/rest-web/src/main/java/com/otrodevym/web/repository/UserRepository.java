package com.otrodevym.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.otrodevym.web.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);

}
