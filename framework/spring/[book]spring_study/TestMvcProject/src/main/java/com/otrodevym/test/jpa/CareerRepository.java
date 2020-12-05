package com.otrodevym.test.jpa;
import org.springframework.data.jpa.repository.JpaRepository;

import com.otrodevym.test.jpa.vo.CareerVO;
public interface CareerRepository extends JpaRepository<CareerVO, Integer>{

}
