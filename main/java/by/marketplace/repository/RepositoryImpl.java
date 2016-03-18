package by.marketplace.repository;

import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import by.marketplace.logic.*;


public class RepositoryImpl implements Repository {

	@Inject private Class<? extends User> userImplClass;
	@Inject private Class<?> userVoClass;
	
	@Override
	public void saveUser(User user) {
		EntityManager manager = null;
		EntityTransaction tx = null;
		try {
			manager = entityManagerFactory.createEntityManager();
			tx = manager.getTransaction();
			tx.begin();
			Object userVO = user.getVO();
			manager.merge(userVO);
			tx.commit();
		} catch (Exception e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace();
		} finally {
			if (manager!=null) manager.close();
		}
	}
	
	@Override
	public User getUser(int id) {
		EntityManager manager = null;
		User result = null;
		try {
			manager = entityManagerFactory.createEntityManager();
			Object userVO = manager.find(userVoClass, id);
			result = userImplClass.newInstance();
			result.constructFromVO(userVO);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (manager!=null) manager.close();
		}
		return result;
	}
	
	@Override
	public User getUser(CriteriaQuery<User> c) {
		EntityManager manager = null;
		User result = null;
		try {
			manager = entityManagerFactory.createEntityManager();
			CriteriaQuery<?> voQuery = manager.getCriteriaBuilder()
					.createQuery(userVoClass);
			voQuery.from(userVoClass);
			voQuery.where(c.getRestriction());
			TypedQuery<?> query = manager.createQuery(voQuery);
			List<?> queryResults = query.getResultList();
			if (!queryResults.isEmpty()) {
				result = userImplClass.newInstance();
				result.constructFromVO(queryResults.get(0));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (manager!=null) manager.close();
		}
		return result;
	}
	@Override
	public List<User> getAllUsers() {
		EntityManager manager = null;
		LinkedList<User> result = null;
		try {
			manager = entityManagerFactory.createEntityManager();
			CriteriaQuery<?> criteria = 
					manager.getCriteriaBuilder().createQuery(userVoClass);
			criteria.from(userVoClass);
			TypedQuery<?> typedQuery = manager.createQuery(criteria);
			List<?> resultsVO = typedQuery.getResultList();
			result = new LinkedList<User>();
			if (!resultsVO.isEmpty()) {
				for (Object vo: resultsVO) {
					User user = userImplClass.newInstance();
					user.constructFromVO(vo);
					result.add(user);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (manager!=null) manager.close();
		}
		
		return result;
	}
	@Override
	public List<User> getAllUsers(CriteriaQuery<User> c) {
		EntityManager manager = null;
		LinkedList<User> result = null;
		try {
			manager = entityManagerFactory.createEntityManager();
			CriteriaQuery<?> criteria = 
					manager.getCriteriaBuilder().createQuery(userVoClass);
			criteria.from(userVoClass);
			criteria.where(c.getRestriction());
			TypedQuery<?> typedQuery = manager.createQuery(criteria);
			List<?> resultsVO = typedQuery.getResultList();
			result = new LinkedList<User>();
			if (!result.isEmpty()) {
				for (Object vo: resultsVO) {
					User user = userImplClass.newInstance();
					user.constructFromVO(vo);
					result.add(user);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (manager!=null) manager.close();
		}
		
		return result;
	}
	@Override
	public void deleteUser(User user) {
		EntityManager manager = null;
		try {
			manager = entityManagerFactory.createEntityManager();
			manager.remove(user.getVO());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (manager!=null) manager.close();
		}
	}
	
	private static final EntityManagerFactory entityManagerFactory =
			Persistence.createEntityManagerFactory("hibernate-mysql");
}
