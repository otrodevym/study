package com.otrodevym.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class SecurityTestController {

	

	@GetMapping("/page")
	public String page() {
		return "/security_test/page";
	}
	
	@GetMapping("/user/page")
	public String userPage() {
		return "/security_test/user/page";
	}
	
	@GetMapping("/member/page")
	public String memberPage() {
		return "/security_test/member/page";
	}
	
	@GetMapping("/admin/page")
	public String adminPage() {
		return "/security_test/admin/page";
	}
	
	
	
	@GetMapping("login")
	public String loginLoginForm() {
		return "/login/login_form";
	}
	@GetMapping("login/{error}")
	public String loginError(@PathVariable(value="error") String error) {
		if(error.equals("true")) {
			return "/login/login_form";
		}
		return "/login/login_form";
	}
	
	
	@GetMapping("/access_denied_page")
	public String access_denied_page() {
		return "/access_denied_page";
	}
	
	
	@GetMapping("/put_test")
	public String putTestGET() {
		return "/security_test/put_test";
	}
	
	@PutMapping("/put_test")
	public String putTest() {
		System.err.println("PUT putTest ");
		return "/home";
	}
	
}
