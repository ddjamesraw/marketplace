package by.marketplace.logic;

import org.springframework.beans.factory.annotation.Autowired;

import by.marketplace.DAO.util.Manager;

public class UserService {
	
	private Manager manager;
	
	private UserFactory factory;
	
	private static int lastPersistedId;
	
	public User get(int id) {
		return factory.getUser(id);
	}

	public synchronized void persist(User u) {
		lastPersistedId = (int) manager.save(u);
	}
	
	public static int getLastPersistedId() {
		return lastPersistedId;
	}

	@Autowired
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
	@Autowired
	public void setFactory(UserFactory factory) {
		this.factory = factory;
	}
}
