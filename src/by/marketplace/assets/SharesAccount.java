package by.marketplace.assets;

import by.marketplace.bank.Account;
import by.marketplace.bank.TransactionErrorCode;
import by.marketplace.bank.TransactionException;

/**
 * Account which can hold shares
 * 
 * @author A.Lagunov
 *
 */
public class SharesAccount extends Account{

	public SharesAccount() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Transfer shares to this account
	 * @param share
	 * @param source
	 * @throws TransactionException
	 */
	public void debit(Shares share, Account source) throws TransactionException{
		super.debit(share, source);
	}
	/**
	 * Transfer shares from this account
	 */
	public void credit(Shares share, Account destination) throws TransactionException{
		if (this.getAssets().contains(share)) {
			this.credit(share, destination);
		} else {
			throw new TransactionException(TransactionErrorCode.INSUFFICIENT_ASSETS);
		}
	}
}
