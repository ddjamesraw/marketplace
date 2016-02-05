package by.marketplace.bank;

import java.util.ArrayList;

import by.marketplace.assets.*;
/**
 * Class represents an abstract account
 * any account can be either frozen or not
 * it can hold some type of assets
 * you can make transactions with this account
 * 
 * @author A.Lagunov
 *
 */
public abstract class Account {
	
	boolean isFrozen;
	
	private String name;
	
	public boolean isFrozen() {
		return isFrozen;
	}

	public void setFrozen(boolean isFrozen) {
		this.isFrozen = isFrozen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Assets> getAssets() {
		return assets;
	}

	public void setAssets(ArrayList<Assets> assets) {
		this.assets = assets;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}
	private ArrayList<Assets> assets;
	
	private ArrayList<Transaction> transactions;
	
	protected void debit(Assets asset, Account source) throws TransactionException{
		if (!isFrozen) {
			this.transactions.add(new Debit(asset, source));
		} else {
			throw new TransactionException(TransactionErrorCode.DESTINATION_IS_FROZEN);
		}
	}
	
	protected void credit(Assets asset, Account destination) throws TransactionException {
		if (!isFrozen) {
			this.transactions.add(new Credit(asset, destination));
		} else {
			throw new TransactionException(TransactionErrorCode.SOURCE_IS_FROZEN);
		}
	}
	/**
	 * Get monetary value for assets stored at this account
	 * @return array of Money (because some assets have different
	 * nominal currencies)
	 */
	public Money[] getMonetaryValue() {
		Money[] value = new Money[assets.size()];
		for (int i=0;i<assets.size();i++) {
			value[i]=assets.get(i).getNominalMonetaryValue();
		}
		return value;
	}
}
