package by.marketplace.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import by.marketplace.logic.UserImpl;
import by.marketplace.logic.UserServiceImpl;
import by.marketplace.repository.Repository;
import by.marketplace.repository.RepositoryImpl;
import by.marketplace.repository.vo.UserVO;

@Configuration
public class ApplicationConfiguration {

	@Bean(name="userService")
	public UserServiceImpl getUserService() {
		return new UserServiceImpl();
	}
	
	@Bean(name="repository")
	public Repository getRepository() {
		return new RepositoryImpl();
	}
	
	@Bean(name="userVoClass")
	public Class<?> getUserVoClass() {
		return UserVO.class;
	}
	
	@Bean(name="userImplClass")
	public Class<?> getUserImplClass() {
		return UserImpl.class;
	}
}
