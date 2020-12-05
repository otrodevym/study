package com.otrodevym.test.servlet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

public class EmployeeSearchServletTest {

	@Test
	public void SearchByEmid_직원을_아이디로_검색() throws Exception{
		MockHttpServletRequest req = new MockHttpServletRequest();
		MockHttpServletResponse res = new MockHttpServletResponse();
		
		req.addParameter("empid", "1234");
		
		EmployeeSearchServlet searchServlet = new EmployeeSearchServlet();
		searchServlet.service(req,res);
		
		Employee employee = (Employee)req.getAttribute("employee");
		assertEquals("이름 확인", "kim", employee.getName());
		assertEquals("아이디 확인", "1234", employee.getEmpid());
		
		assertEquals("URL 확인", "/searchResult.jsp", res.getForwardedUrl());
	}
}
