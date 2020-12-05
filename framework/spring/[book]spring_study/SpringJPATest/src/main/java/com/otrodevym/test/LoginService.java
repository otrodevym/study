package com.otrodevym.test;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	@Inject
	private LoginRepository loginRepository;

	public void save(LoginVO loginVo) {
		loginRepository.save(loginVo);
		loginRepository.flush();
	}
	
	
}
