package by.marketplace.assets;

public class BondsMonetaryValue implements MonetaryValue{
	
	Money nominalValue;
	/**
	 * 
	 * @param currency
	 * @param quantity
	 * @param nominalValue
	 */
	public BondsMonetaryValue(Currency currency,int quantity,double nominalValue) {
		this.nominalValue = new Money(nominalValue*quantity,currency);
	}

	@Override
	public Money getNominalMonetaryValue() {
		return nominalValue;
	}

}
