package com.otrodevym.test;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestVO, Integer>{

	public TestVO findByTest(String test);

	public TestVO findByTestId(String testId);


}
