package com.otrodevym.test.jpa;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.otrodevym.test.jpa.vo.CareerVO;
import com.otrodevym.test.jpa.vo.LoginVO;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/**/**.xml")
public class CareerTest {
	
	@Inject
	private CareerRepository careerRepository;
	@Inject
	private LoginRepository loginRepository;
	
	
	@Before
	public void setUp() {
		
	}
	
	@Test
	public void loginSaveTest() throws Exception{
		LoginVO loginVo = new LoginVO();
		loginVo.setUser_id("test123");
		loginVo.setPassword("qwe");
		loginVo.setAuthority("1");
		loginVo.setEnabled("1");
		loginRepository.save(loginVo);
		loginRepository.flush();
	}
	
	@Test
	public void loginFindAllTest() throws Exception{
		List<LoginVO> list = loginRepository.findAll();
		assertEquals("추가 1 개 사이즈 1개  인지 확인", list.size(), 1);
	}
	
	@Test
	public void jpaSabeTest() throws Exception{
		CareerVO careerVo = new CareerVO();
		careerVo.setCareer_id(1);
		careerVo.setCompany_name("home");
		careerVo.setDepartment(1);
		careerVo.setFinish_date(new Date());
		careerVo.setStart_date(new Date());
		careerVo.setPosition(1);
		careerVo.setResume_id(1);
		careerVo.setTask("dev");
		careerVo.setWrite_date(new Date());
		careerRepository.save(careerVo);
		careerRepository.flush();
	}
	
	@Test
	public void jpaFindAllTest() throws Exception{
		List<CareerVO> list = careerRepository.findAll();
		assertEquals("1개 추가 확인", list.size(), 1);
	}

}
