package by.marketplace.assets;
/**
 * This class defines should shares calculate their monetary value
 * 
 * @author A.Lagunov
 *
 */
public class SharesMonetaryValue implements MonetaryValue{
	Money nominalValue;
	/**
	 * 
	 * @param currency
	 * @param quantity
	 * @param nominalValue
	 */
	public SharesMonetaryValue(Currency currency, int quantity, double nominalValue) {
		this.nominalValue = new Money(quantity*nominalValue, currency);
	}
	/**
	 * Returns NOMINAL monetary value of this shares
	 */
	@Override
	public Money getNominalMonetaryValue() {
		return nominalValue;
	}

}
