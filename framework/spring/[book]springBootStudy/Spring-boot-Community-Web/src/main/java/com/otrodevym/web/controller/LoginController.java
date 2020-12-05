package com.otrodevym.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.otrodevym.web.annotation.SocialUser;
import com.otrodevym.web.domain.User;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String login() {
		return "login";
	}

//	@GetMapping(value = "/{facebook|google|kakao}/complate")
//	public String loginComplate(HttpSession session) {
//		OAuth2Authentication authentication = (OAuth2Authentication) SecurityContextHolder.getContext()
//				.getAuthentication();
//		Map<String, String> map = (HashMap<String, String>)authentication.getUserAuthentication().getDetails();
//		session.setAttribute("user", User.builder()
//				.name(map.get("name"))
//				.email(map.get("email"))
//				.principal(map.get("id"))
//				.socialType(SocialType.FACEBOOK)
//				.createdDate(LocalDateTime.now())
//				.build()
//				);
//		
//		return "redirect:/board/list";
//	}
//	@GetMapping(value = "/{facebook|google|kakao}/complate")
//	public String loginComplate(@SocialUser User user) {
//		
//		return "redirect:/board/list";
//	}
	@GetMapping(value = "loginSuccess")
	public String loginComplate(@SocialUser User user) {
		
		return "redirect:/board/list";
	}
}
