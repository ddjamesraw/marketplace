package by.marketplace.bank.account;

public class CashAccountType implements AccountType{
	
	private final int mask = 1010;

	@Override
	public int getMask() {
		return this.mask;
	}

}
