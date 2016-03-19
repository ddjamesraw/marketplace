package by.marketplace.repository;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import by.marketplace.logic.*;


public class RepositoryImpl<T extends ConstructableFromVo<?>, U> implements Repository<T, U> {
	
	private static final EntityManagerFactory entityManagerFactory =
			Persistence.createEntityManagerFactory("hibernate-mysql");

	public RepositoryImpl(Class<? extends T> implClass, Class<? extends U> voClass) {
		this.implClass = implClass;
		this.voClass = voClass;
	}
	
	private Class<? extends T> implClass;
	private Class<? extends U> voClass;
	
	@Override
	public void save(T object) {
		EntityManager manager = null;
		EntityTransaction tx = null;
		try {
			manager = entityManagerFactory.createEntityManager();
			tx = manager.getTransaction();
			tx.begin();
			Object vo = object.getVO();
			manager.merge(vo);
			tx.commit();
		} catch (Exception e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace();
		} finally {
			if (manager!=null) manager.close();
		}
	}
	
	@Override
	public T get(int id) {
		EntityManager manager = null;
		T result = null;
		try {
			manager = entityManagerFactory.createEntityManager();
			Object vo = manager.find(voClass, id);
			result = implClass.newInstance();
			result.constructFromVO(vo);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (manager!=null) manager.close();
		}
		return result;
	}
	
	@Override
	public T get(CriteriaQuery<T> c) {
		EntityManager manager = null;
		T result = null;
		try {
			manager = entityManagerFactory.createEntityManager();
			CriteriaQuery<?> voQuery = manager.getCriteriaBuilder()
					.createQuery(voClass);
			voQuery.from(voClass);
			voQuery.where(c.getRestriction());
			TypedQuery<?> query = manager.createQuery(voQuery);
			List<?> queryResults = query.getResultList();
			if (!queryResults.isEmpty()) {
				result = implClass.newInstance();
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
	public List<T> getAll() {
		EntityManager manager = null;
		LinkedList<T> results = null;
		try {
			manager = entityManagerFactory.createEntityManager();
			CriteriaQuery<?> criteria = 
					manager.getCriteriaBuilder().createQuery(voClass);
			criteria.from(voClass);
			TypedQuery<?> typedQuery = manager.createQuery(criteria);
			List<?> resultsVO = typedQuery.getResultList();
			results = new LinkedList<T>();
			if (!resultsVO.isEmpty()) {
				for (Object vo: resultsVO) {
					T elem = implClass.newInstance();
					elem.constructFromVO(vo);
					results.add(elem);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (manager!=null) manager.close();
		}
		
		return results;
	}
	
	public <V extends Comparable<V>> List<T> getByAttributeBetween(
			String attribute, V loLimit, V hiLimit) {
		EntityManager manager = null;
		LinkedList<T> results = null;
		CriteriaQuery<? extends U> query = null;
		try {
			manager = entityManagerFactory.createEntityManager();
			CriteriaBuilder cb = entityManagerFactory.getCriteriaBuilder();
			query = cb.createQuery(voClass);
			Root<? extends U> root = query.from(voClass);
			Path<V> field = root.get(attribute);
			Predicate condition = cb.between(field, loLimit, hiLimit);
			query.where(condition);
			TypedQuery<? extends U> q = manager.createQuery(query);
			List<? extends U> resultsVO = q.getResultList();
			results = new LinkedList<T>();
			if (!resultsVO.isEmpty()) {
				for (Object vo: resultsVO) {
					T elem = implClass.newInstance();
					elem.constructFromVO(vo);
					results.add(elem);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (manager!=null) manager.close();
		}
		
		return results;
	}
			
	@Override
	public List<T> getAll(CriteriaQuery<T> c) {
		EntityManager manager = null;
		LinkedList<T> results = null;
		try {
			manager = entityManagerFactory.createEntityManager();
			CriteriaQuery<?> criteria = 
					manager.getCriteriaBuilder().createQuery(voClass);
			Root<?> root = criteria.from(voClass);
//			criteria.where(c.getRestriction());
			criteria.where(root.get("id").in(299,301));
			TypedQuery<?> typedQuery = manager.createQuery(criteria);
			List<?> resultsVO = typedQuery.getResultList();
			results = new LinkedList<T>();
			if (!results.isEmpty()) {
				for (Object vo: resultsVO) {
					T elem = implClass.newInstance();
					elem.constructFromVO(vo);
					results.add(elem);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (manager!=null) manager.close();
		}
		
		return results;
	}
	
	@Override
	public void delete(T obj) {
		EntityManager manager = null;
		try {
			manager = entityManagerFactory.createEntityManager();
			manager.remove(obj.getVO());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (manager!=null) manager.close();
		}
	}

	@Override
	public T getEmptyInstance() {
		T implInstance = null;
		try {
			implInstance = implClass.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return implInstance;
	}
}
