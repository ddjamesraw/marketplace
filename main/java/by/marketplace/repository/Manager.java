package by.marketplace.repository;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

public interface Manager {
	public Object get(Class<?> persistentClass, int id);
	public Object get(CriteriaQuery<Object> c);
	public List<?> getAll(Class<?> persistentClass);
	public void save(Object object);
	public void delete(Class<?> persistentClass, int id);
}
