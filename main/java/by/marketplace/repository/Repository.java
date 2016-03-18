package by.marketplace.repository;

import java.util.List;

import javax.persistence.criteria.*;

import by.marketplace.logic.User;

public interface Repository {
	public User getUser(int id);
	public User getUser(CriteriaQuery<User> c);
	public List<User> getAllUsers();
	public List<User> getAllUsers(CriteriaQuery<User> c);
	public void saveUser(User user);
	public void deleteUser(User user);
}
