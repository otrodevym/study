package com.otrodevym.web.domain.projection;

import org.springframework.data.rest.core.config.Projection;

import com.otrodevym.web.domain.User;

@Projection(name="getOnlyName", types=User.class)
public interface UserOnlyContainName {

	String getName();
}
