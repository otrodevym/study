package com.otrodevym.test.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

public class EmployeeSearchServlet extends HttpServlet {

	private SearchBiz searchBiz;

	public void service(MockHttpServletRequest req, MockHttpServletResponse res) throws ServletException, IOException {
		searchBiz = new SearchBiz();
		Employee employee = searchBiz.getEmployeeByEmpid(req.getParameter("empid"));

		req.setAttribute("employee", employee);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/searchResult.jsp");
		dispatcher.forward(req, res);
	}
	
	public void setModel(SearchBiz biz) {
		this.searchBiz = biz;
	}

}
