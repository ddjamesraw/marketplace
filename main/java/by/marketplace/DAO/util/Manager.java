package by.marketplace.DAO.util;

import java.io.Serializable;

public interface Manager {
	public Serializable save(Object object);
	public void saveOrUpdate(Object object);
	public Object get(Select selector);
}
