package by.marketplace.logic;

import org.springframework.beans.factory.annotation.Autowired;

import by.marketplace.DAO.entities.UserDAO;
import by.marketplace.DAO.util.Manager;
import by.marketplace.DAO.util.Select;

public class UserFactoryImpl implements UserFactory {
	
	public User getUser(int id) {
		UserDAO userDAO =  (UserDAO) manager.get(Select.User.byId(id));
		return new UserImpl(userDAO);
	}
	
	private Manager manager;
	
	@Autowired
	public void setManager(Manager manager) {
		this.manager = manager;
	}
}
