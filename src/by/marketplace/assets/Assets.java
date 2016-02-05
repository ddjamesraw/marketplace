package by.marketplace.assets;
/**
 * This class represents abstract economic resource
 * 
 * @author A.Lagunov
 *
 */
public abstract class Assets implements MonetaryValue {
	MonetaryValue monetaryValue;
	/**
	 * Using 'strategy' pattern to delegate responsibility
	 * of returning monetary value of an asset.
	 * @return
	 */
	public Money getNominalMonetaryValue() {
		return monetaryValue.getNominalMonetaryValue();
	}
	public Assets(MonetaryValue monetaryValue) {
		this.monetaryValue = monetaryValue;
	}
	
}
