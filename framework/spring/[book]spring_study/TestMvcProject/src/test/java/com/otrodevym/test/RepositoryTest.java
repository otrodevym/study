package com.otrodevym.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations="fils:src/main/java/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
public class RepositoryTest {
	
	@Autowired
	private UserDAO userDAO;
	
	private User user;
	
	@Before
	public void setup() throws Exception{
		user = new User();
		user.setName("ym");
	}
	
	@Test
	public void 테스트_합니다() throws Exception{
		User u = userDAO.saveUser(user);
		Assert.assertEquals(u.getName(), user.getName());
	}

}
