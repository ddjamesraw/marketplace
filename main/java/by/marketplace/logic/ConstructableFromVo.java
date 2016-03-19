package by.marketplace.logic;

/**
 * User should implement this interface on BusinessLogic class to make it
 * able to be persisted with repository
 * 
 * @author A.Lagunov
 *
 * @param <T> ValueObject class
 */
public interface ConstructableFromVo<T> {

	/**
	 * Implementor must use this method to fill itself with values from 
	 * provided ValueObject
	 * @param userVO ValueObject
	 */
	public void constructFromVO(Object userVO);
	
	/**
	 * Implementor must provide a concrete method which returns ValueObject
	 * constructed from the instance of the class implementing this interface
	 * @return
	 */
	public T getVO();
}
