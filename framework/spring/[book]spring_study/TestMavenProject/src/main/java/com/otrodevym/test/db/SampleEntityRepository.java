package com.otrodevym.test.db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleEntityRepository extends JpaRepository<SampleEntity, String> {
	
	public List<SampleEntity> findByNameLike(String name);
	public List<SampleEntity> findByMailEndingWith(String mail);
}
