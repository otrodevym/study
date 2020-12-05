package com.otrodevym.test.custom;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;


public class CustomizeAuthenticationFailureHandler implements AuthenticationFailureHandler {
	
	@Autowired
	private BCryptPasswordEncoder new_encoder;
	

	@Override
	public void onAuthenticationFailure(HttpServletRequest req, HttpServletResponse res,
			org.springframework.security.core.AuthenticationException exception) throws IOException, ServletException {
		new_encoder = new BCryptPasswordEncoder(); 
		System.err.println("로그인 실패");
		System.err.println(new Exception().getMessage());
		System.err.println("user_id : " + req.getParameter("user_id"));
		System.err.println("user_passwd : " + req.getParameter("user_passwd"));
		String passwd = req.getParameter("user_passwd");
		String raw_passwd = "qwe";
		String en_passwd = "$2a$10$U23dLUDB9ABFXCfK0PO6kukpXIG.gwHHguAmvUKLYEjYgvGvsTgRu";
		System.err.println("passwd : " + passwd);
		String passwd_con = new_encoder.encode(passwd);
		System.err.println("passwd_con : " + passwd_con);
		System.err.println(" check : " + new_encoder.matches(raw_passwd, en_passwd));
//		System.err.println("user_passwd : " + encoder.encode(req.getParameter("user_passwd")));
		
		
		res.sendRedirect(req.getContextPath() + "/login?error=true");
		
//		req.getRequestDispatcher("/login.do").forward(req, res);		
	}

}
