package by.marketplace.logic;

import javax.inject.Inject;

import by.marketplace.repository.Repository;
import by.marketplace.repository.vo.UserVO;

public class UserServiceImpl implements UserService 
{

	@Inject private Repository<User, UserVO> repository;

	@Override
	public Repository<User, UserVO> getRepository() {
		return repository;
	}
	
}
