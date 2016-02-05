package by.marketplace.assets;
/**
 * Class used to represent some amount of money
 * of some currency
 * @author A.Lagunov
 *
 */
public class Money extends Assets{
	
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
}
