package by.marketplace.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import by.marketplace.DAO.util.Manager;
import by.marketplace.DAO.util.ManagerImpl;
import by.marketplace.logic.UserFactory;
import by.marketplace.logic.UserFactoryImpl;
import by.marketplace.logic.UserService;

@Configuration
public class ApplicationConfiguration {

	@Bean(name="userService")
	public UserService getUserService() {
		return new UserService();
	}
	
	@Bean(name="userFactory")
	public UserFactory getUserFactory() {
		return new UserFactoryImpl();
	}
	
	@Bean(name="manager")
	public Manager getManager() {
		return new ManagerImpl();
	}
}
