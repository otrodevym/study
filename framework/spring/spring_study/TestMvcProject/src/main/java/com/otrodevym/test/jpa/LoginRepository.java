package com.otrodevym.test.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.otrodevym.test.jpa.vo.LoginVO;

public interface LoginRepository extends JpaRepository<LoginVO, Integer>{

}
