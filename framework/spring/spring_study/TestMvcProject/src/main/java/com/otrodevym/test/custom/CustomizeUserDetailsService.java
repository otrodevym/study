package com.otrodevym.test.custom;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomizeUserDetailsService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return null;
	}
	
	/*@Autowired 
	MemberMapper memberMapper;*/
	
/*	@Autowired
	MemberService memberService;
	
	static final BCryptPasswordEncoder passwd = new BCryptPasswordEncoder();
	
	@Override
	public UserDetails loadUserByUsername(String user_id) throws UsernameNotFoundException {
		
		MemberVO memberInfo = new MemberVO();
		memberInfo.setUser_id(user_id);
		
		
//		memberInfo = memberMapper.getUserInfo(memberInfo);
		if(null != memberInfo) {
			throw new UsernameNotFoundException("User details not found whith this memberInfo");
		}

		UserDetails User = new User(memberInfo.getUser_id(), memberInfo.getPassword(),getAuthorities(memberInfo.getUser_type()));
		return User;
	}
	
	private Collection<SimpleGrantedAuthority> getAuthorities(String role){
		Collection<SimpleGrantedAuthority> authList = new ArrayList<SimpleGrantedAuthority>();
//			authList.add(new SimpleGrantedAuthority("ROLE_GUEST"));
			if(null != role && role.trim().length() > 0) {
				if("2".equals(role)) {
					authList.add(new SimpleGrantedAuthority("ROLE_USER"));
				}else if("3".equals(role)) {
					authList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
				}
			}
		return authList;
	}*/
}
