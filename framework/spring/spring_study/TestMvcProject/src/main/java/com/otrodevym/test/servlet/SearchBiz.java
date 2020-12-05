package com.otrodevym.test.servlet;


public class SearchBiz {

	public Employee getEmployeeByEmpid(String parameter) {
		Employee emp = new Employee();
		
		emp.setName("kim");
		emp.setEmpid("1234");
		
		
		return emp;
	}

}
