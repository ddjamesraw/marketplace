package by.marketplace.assets;
/**
 * Calculation of monetary value of an asset 
 * is delegated for classes that implement this 
 * interface.
 * @author A.Lagunov
 *
 */
public interface MonetaryValue {
	public Money getNominalMonetaryValue();
}
