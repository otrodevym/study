package com.otrodevym.test.lombok;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/**/**.xml")
public class LombokTest {
	
	private final static Logger logger = LoggerFactory.getLogger(LombokTest.class);

	@Test
	public void lombokTest() {
		String id = "test";
		String name = "test";
		String job = "job";
		LombokVO vo = LombokVO.builder().id(id).name(name).job(job).build();
		
		logger.info(vo.toString());
	}

}
