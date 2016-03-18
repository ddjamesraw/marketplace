//package by.marketplace.repository.vo;
//
//import java.lang.reflect.Field;
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//import javax.persistence.TypedQuery;
//import javax.persistence.criteria.CriteriaQuery;
//import org.hibernate.HibernateException;
//
//import by.marketplace.logic.annotations.Persistent;
//import by.marketplace.repository.Manager;
//
//public class ManagerImpl implements Manager 
//{
//	public void save(Object logicObject) 
//	{	
//		Class<?> persistentClass = logicObject.getClass()
//				.getAnnotation(Persistent.class).daoClass();
//		Field[] persistentFields = persistentClass.getDeclaredFields();
//		try {
//			Object persistentObject = persistentClass.newInstance();
//			for (Field f:persistentFields) {
//				f.setAccessible(true);
//				Object obb = f.get(logicObject);
//				f.set(persistentObject, obb);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		EntityManager manager = null;
//		EntityTransaction tx = null;
//		try 
//		{
//			manager = entityManagerFactory.createEntityManager();
//			tx = manager.getTransaction();
//			tx.begin();
//			manager.merge(logicObject);
//			tx.commit();
//		} 
//		
//		catch (Exception e) 
//		{
//			if (tx!=null) tx.rollback();
//			e.printStackTrace();
//			throw e;
//		}
//		
//		finally
//		{
//			if (manager!=null) manager.close();
//		}
//	}
//	
//	public Object get(Class<?> persistentClass, int id) 
//	{
//		EntityManager manager = entityManagerFactory.createEntityManager();
//		Object result = null;
//		try {
//			result = manager.find(persistentClass.getAnnotation(Persistent.class).daoClass(), id);
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			manager.close();
//		}
//		return result;
//	}
//
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	@Override
//	public Object get(CriteriaQuery c) {
//		EntityManager manager = entityManagerFactory.createEntityManager();
//		TypedQuery query = null;
//		Object result = null;
//		try {
//			query = manager.createQuery(c);
//			result = query.getResultList();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			manager.close();
//		}
//		return result;
//	}
//	
//	@Override
//	public List<?> getAll(Class<?> persistentClass) {
//		EntityManager manager = entityManagerFactory.createEntityManager();
//		List<?> result = null;
//		try {
//			String tableName = manager.getMetamodel()
//					.entity(persistentClass)
//					.getName();
//			Query query = manager.createQuery(
//					String.format("SELECT * FROM %s;", tableName));
//			result = query.getResultList();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			manager.close();
//		}
//		return result;
//	}
//
//	@Override
//	public void delete(Class<?> persistentClass, int id) 
//	{
//		EntityManager manager = null;
//		EntityTransaction tx = null;
//		try 
//		{
//			manager = entityManagerFactory.createEntityManager();
//			tx = manager.getTransaction();
//			tx.begin();
//			Object object = 
//					manager.find(persistentClass, id);
//			manager.remove(object);
//			tx.commit();
//		} 
//		
//		catch (Exception e) 
//		{
//			if (tx!=null) tx.rollback();
//			e.printStackTrace();
//			throw e;
//		}
//		
//		finally
//		{
//			if (manager!=null) manager.close();
//		}
//	}
//	
//	@Override
//	protected void finalize() {
//		
//		try {
//			super.finalize();
//			entityManagerFactory.close();
//		} 
//		
//		catch (Throwable e) 
//		{
//			e.printStackTrace();
//		}
//	}
//
//}
