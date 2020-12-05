package com.otrodevym.web.domain.projection;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class CustomizedRestMvcConfiguration extends RepositoryRestConfigurerAdapter{
// 참고만 
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.getProjectionConfiguration().addProjection(UserOnlyContainName.class);
	}
}
