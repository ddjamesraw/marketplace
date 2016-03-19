package by.marketplace.repository;

import java.util.List;

import javax.persistence.criteria.*;

import by.marketplace.logic.ConstructableFromVo;

/**
 * 
 * @author A.Lagunov
 *
 * @param <T> BusinessLogic Class
 * @param <U> ValueObject Class
 */
public interface Repository<T extends ConstructableFromVo<?>, U> {
	public T get(int id);
	public T get(CriteriaQuery<T> c);
	public List<T> getAll();
	public List<T> getAll(CriteriaQuery<T> c);
	public void save(T object);
	public void delete(T object);
	
	/**<p>Find entities which have field's value between given boundaries</p>
	 * <br/>
	 * <p>This method is a wrapper around complex CriteriaQuery API</p>
	 * 
	 * @param <V> the type of the field
	 * @param attribute name of the field 
	 * @param loLimit lower boundary for field values
	 * @param hiLimit higher boundary for field values
	 * @return query results
	 */
	public <V extends Comparable<V>> List<T> getByAttributeBetween(String attribute, V loLimit, 
			V hiLimit);
	
	public T getEmptyInstance();
	
}
