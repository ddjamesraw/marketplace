package by.marketplace.bank.account;

import by.marketplace.assets.Assets;
import by.marketplace.assets.Currency;
import by.marketplace.assets.Money;
import by.marketplace.bank.transaction.TransactionError;
import by.marketplace.bank.transaction.TransactionException;

/**
 * Account which holds some value of money
 * 
 * @author A.Lagunov
 *
 */
public class CurrencyAccount extends Account {
	
	/**
	 * Account should deny transactions
	 * if they are of different currency
	 */
	private Currency currency;
	
	public CurrencyAccount(Currency currency) {
		this.currency = currency;
	}
	
	public void debit(Assets assets,Account source) throws TransactionException{
		try {
			Money money = (Money) assets;
			if (money.getCurrency().ordinal()!=currency.ordinal()) {
				throw new TransactionException(TransactionError.WRONG_ACCOUNT_TYPE);
			} else {
				super.debit(money, source);
			}
		} catch (ClassCastException e) {
			throw new TransactionException(TransactionError.WRONG_ACCOUNT_TYPE);
		}
		
	}

}
