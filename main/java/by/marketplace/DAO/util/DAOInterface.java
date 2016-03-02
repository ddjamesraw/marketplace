package by.marketplace.DAO.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;

/**
 * <p><b>Singleton</b></p>
 * @author A.Lagunov
 *
 */
public class DAOInterface {
	
	/**
	 * <p>Save an object and return generated <b>int</b> id</p>
	 * @param object object to save
	 * @return An integer, the generated id for saved entity. 0 if class is not mapped
	 * @throws ClassCastException - if returned id is not int
	 * @throws HibernateException - on mapping and other Hibernate issues
	 */
	public Serializable save(Object object) throws HibernateException, ClassCastException{
		//If class was not mapped
		if (factory.getClassMetadata(object.getClass())==null) return 0;
		
		Serializable generatedId = -1;
		Session session = null;
		
		try {
			session = factory.openSession();
			
			tx = session.beginTransaction();
			generatedId = (Serializable) session.save(object);
			tx.commit();
			
		} catch (HibernateException ex) {
			tx.rollback();
			throw new HibernateException(ex);
		} catch (ClassCastException cce) {
			tx.rollback();
			throw new ClassCastException("Returned ID is String, not int");
		} finally {
			if (session!=null) session.close();
		}

		return generatedId;
	}
	/**
	 * <p>Save or Update an object</p>
	 * @param o object to save
	 * @throws ClassCastException - if returned id is not int
	 * @throws HibernateException - on mapping and other Hibernate issues
	 * @param o
	 */
	public void saveOrUpdate(Object o) {
		
		Session session = null;
		
		try {
			session = factory.openSession();
			
			tx = session.beginTransaction();
			session.saveOrUpdate(o);
			tx.commit();
		} catch (HibernateException ex) {
			tx.rollback();
			throw new HibernateException(ex);
		} catch (ClassCastException cce) {
			tx.rollback();
			throw new ClassCastException("Returned ID is String, not int");
		} finally {
			if (session!=null) session.close();
		}
	}
	
	public Object get(Select selector) {
		Object result = null;
		Session session = null;
		
		try {
			
			session = factory.openSession();
			
			result = session.get(selector.getCorrespondingClass(), selector.getId());
			
		} catch (HibernateException ex) {
			ex.printStackTrace();
			throw new HibernateException(ex);
		} finally {
			session.close();
		}
		
		return result;
	}
	
	@SuppressWarnings("rawtypes")
	public ArrayList getByCriteria(Select selector, List<Criterion> criterions) {
		ArrayList results = null;
		
		try {
			
			Criteria criteria = factory.openSession().createCriteria(selector.getCorrespondingClass());
			
			for (Criterion c: criterions) {
				criteria.add(c);
			}
			
			results = (ArrayList) criteria.list();
			
		} catch (HibernateException ex) {
			ex.printStackTrace();
			throw new HibernateException(ex);
		}
		
		return results;
		
	}
	
	public static DAOInterface getInstance() {
		if (instance==null) instance = new DAOInterface();
		return instance;
	}
	
	/**
	 * SessionFactory initializer
	 */
	{
		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
	
	/**
	 * 
	 * SessionFactory destroyer
	 */
	@Override
	protected void finalize() {
		try {
			super.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			factory.close();
		}
	}
	
	private static DAOInterface instance = new DAOInterface();
	
	private DAOInterface(){}
	
	private static SessionFactory factory;
	
	private static Transaction tx = null;
	
}
