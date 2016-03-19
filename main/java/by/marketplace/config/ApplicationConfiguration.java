package by.marketplace.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import by.marketplace.logic.*;
import by.marketplace.repository.Repository;
import by.marketplace.repository.RepositoryImpl;
import by.marketplace.repository.vo.DepositoryVO;
import by.marketplace.repository.vo.UserVO;

@Configuration
public class ApplicationConfiguration {

	@Bean(name = "userService")
	public UserServiceImpl getUserService() {
		return new UserServiceImpl();
	}
	
	@Bean(name = "userRepository")
	public Repository<User, UserVO> getUserRepository() {
		return new RepositoryImpl<User, UserVO>(UserImpl.class, UserVO.class);
	}
	
	@Bean(name = "depService")
	public DepositoryService getDepService() {
		return new DepositoryServiceImpl();
	}
	
	@Bean(name = "depRepository")
	public Repository<Depository, DepositoryVO> getDepRepository() {
		return new RepositoryImpl<Depository, DepositoryVO>(
				DepositoryImpl.class, DepositoryVO.class);
	}
}
