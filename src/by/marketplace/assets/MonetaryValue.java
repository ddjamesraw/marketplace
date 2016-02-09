package by.marketplace.assets;
/**
 * Calculation of monetary value of an asset 
 * is delegated for classes that implement this 
 * interface.
 * @author A.Lagunov
 *
 */
public interface MonetaryValue extends Comparable<Asset>{
	/**
	 * <p>Returns 'Money' object that represent monetary 
	 * value of an asset in the nominal currency</p>
	 * @return
	 */
	public Money getNominalMonetaryValue();
	/**
	 * <p>Throws an exception if nominal values are of different currencies</p> 
	 * <p>User must consider converting values to the <b>same currencies</b> 
	 * before comparison</p>
	 * @param value
	 * @return
	 * @throws Exception
	 */
	public int compareTo(Asset value) throws ClassCastException;
}
