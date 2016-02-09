package by.marketplace.assets;
/**
 * <p>Class represent some amount of money
 * of some nominal currency</b>
 * 
 * @author A.Lagunov
 *
 */
public class Money extends Asset implements MonetaryValue, Tradeable{
	
	private Currency currency;
	
	private double amount;

	public Money(double amount,Currency currency) {
		this.currency = currency;
		this.amount = amount;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String toString() {
		return String.format("%.2f %s", this.getAmount(), this.getCurrency().toString());
	}
	
	@Override
	public Money getNominalMonetaryValue() {
		return this;
	}
	/**
	 * <p>User should convert values before comparison</p>
	 * 
	 * @throws Exception
	 */
	@Override
	public int compareTo(Asset value) throws ClassCastException {
		if (this.getNominalMonetaryValue().currency!=value.getNominalMonetaryValue().currency) {
			throw new ClassCastException("Не могу сравнить номиналы разных валют");
		} else {
			return (int)Math.ceil(this.getNominalMonetaryValue().amount-value.getNominalMonetaryValue().amount);
		}
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
