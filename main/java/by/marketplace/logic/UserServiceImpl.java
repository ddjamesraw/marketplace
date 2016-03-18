package by.marketplace.logic;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import by.marketplace.repository.Repository;

public class UserServiceImpl implements UserService 
{
	@Inject
	private Repository repository;
	
	@Override
	public User get(int id) {
		return repository.getUser(id);
	}

	@Override
	public synchronized void save(
			@NotNull(message = "{validate.user.saveUser}")
			@Valid User user) 
	{
		repository.saveUser(user);
	}

	@Override
	public List<User> getAll() {
		return repository.getAllUsers();
	}
}
