package by.marketplace.assets;
/**
 * This class represents abstract economic resource
 * 
 * @author A.Lagunov
 *
 */
public abstract class Asset implements MonetaryValue{
	
	public abstract Money getNominalMonetaryValue();
	
}
