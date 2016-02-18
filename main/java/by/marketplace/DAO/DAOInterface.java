package by.marketplace.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DAOInterface {
	
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
	 * <p>Save an object of class 'User' to database</p>
	 * @param <b>EntityType</b> object to save
	 * @return <b>int</b> generated id. Returns <b>-1</b> in case of failure
	 * @throws Exception 
	 */
	public int saveUser(User u) throws HibernateException {
		int generatedId = -1;
		
		try {
			Session session = factory.openSession();
			
			GenericEntity ge = new GenericEntity();
			ge.setEntityType(session.get(EntityType.class, 1));
			
			tx = session.beginTransaction();
			generatedId = (int) session.save(ge);
			u.setId(generatedId);
			session.save(u);
			tx.commit();
			
		} catch (HibernateException ex) {
			tx.rollback();
			throw new HibernateException(ex);
		}
		
		return generatedId;
		
	}
	
	/**
	 * <p>Retrieve a User</p> 
	 * @param id User's id
	 */
	public User getUser(int id) {
		
		User u = null;
		
		try {
			Session session = factory.openSession();
			u = session.get(User.class, id);
		} catch (HibernateException ex) {
			ex.printStackTrace();
			throw new HibernateException(ex);
		}
		
		return u;
	}
	
	/**
	 * <p>Creates a passport for a given user's id</p>
	 * @param id User's id
	 * @param passport Passport
	 * @return unique passport SN, as specified by client
	 * @return null in case of failure
	 */
	public String savePassportForUserId(int id, Passport passport) {

		String generatedId = null;
		
		try {
			Session session = factory.openSession();

			User u = this.getUser(id);
			
			if (u==null) return null;
			
			u.setPassport(passport);
			
			tx = session.beginTransaction();
			generatedId = (String) session.save(passport);
			session.update(u);
			tx.commit();
			
		} catch (HibernateException ex) {
			tx.rollback();
			ex.printStackTrace();
			throw new HibernateException(ex);
		}
		
		return generatedId;
	}

	private static DAOInterface instance = new DAOInterface();
	
	private DAOInterface(){}
	
	private static SessionFactory factory;
	
	private static Transaction tx = null;
	
	
}
