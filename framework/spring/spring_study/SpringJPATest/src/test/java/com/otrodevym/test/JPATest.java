package com.otrodevym.test;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/**/**.xml")
public class JPATest {
	
	@Inject
	private LoginService loginService;
	
	@Inject
	private LoginRepository loginRepo;
	@Inject
	private TestRepository testRepo;

	@Test
	public void hello() {
		assertEquals("hello", 1,1);
	}
	@Test
	public void test_call() {
		TestVO vo = new TestVO();
		vo.setName("123");
		vo.setTest("test");
		vo.setTestId("test_idqwe");
		testRepo.save(vo);
	}
	
	@Test
	public void testFindByTest() {
		String test = "test";
		TestVO vo = testRepo.findByTest(test);
		System.out.println(vo.getTestId());
	}
	
	@Test
	public void testFindByTest_id() {
		String testId = "test_idqwe";
		TestVO vo = testRepo.findByTestId(testId);
		System.out.println(vo.getTest());
	}
	
	@Test
	public void testUpdateTest() {
		TestVO vo = new TestVO();
		vo.setTest("www");
		vo.setName("qwe");
		vo.setTestId("qwe");
		testRepo.save(vo);
		vo.setTest("www");
		vo.setName("www");
		vo.setTestId("www");
		testRepo.save(vo);
	}
	
	@Test
	public void testDeleteTest() {
		TestVO vo = new TestVO();
		vo.setTest("qqq");
		vo.setName("qqq");
		vo.setTestId("qqq");
		testRepo.save(vo);
		TestVO t = new TestVO();
		t.setTest("qqq");
		testRepo.delete(vo);
	}
	@Test
	public void jpaSave() {
		LoginVO loginVo = new LoginVO();
		loginVo.setUser_id("test123");
		loginVo.setPassword("qwe");
		loginVo.setAuthority("1");
		loginVo.setEnabled("1");
		loginService.save(loginVo);
	}
	
	@Test
	public void japUpdate() {
		LoginVO loginVo = new LoginVO();
		loginVo.setUser_id("test123");
		loginVo.setPassword("qwe");
		loginVo.setAuthority("0");
		loginVo.setEnabled("0");
		loginRepo.save(loginVo);
//		LoginVO temp = loginRepo.findByUser_id(loginVo.getUser_id());
	}
}
