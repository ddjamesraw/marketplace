package by.marketplace.logic;

import java.util.List;

import org.springframework.validation.annotation.Validated;

@Validated
public interface UserService {
	public void save(User u);
	public User get(int id);
	public List<User> getAll();
}
