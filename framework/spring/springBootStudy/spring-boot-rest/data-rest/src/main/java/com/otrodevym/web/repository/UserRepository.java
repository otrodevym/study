package com.otrodevym.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.otrodevym.web.domain.User;
import com.otrodevym.web.domain.projection.UserOnlyContainName;

@RepositoryRestResource(excerptProjection=UserOnlyContainName.class)
public interface UserRepository extends JpaRepository<User, Long>{

}
