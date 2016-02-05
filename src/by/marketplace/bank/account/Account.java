package by.marketplace.bank.account;

import java.util.ArrayList;

import by.marketplace.assets.*;
import by.marketplace.bank.Bank;
import by.marketplace.bank.transaction.Credit;
import by.marketplace.bank.transaction.Debit;
import by.marketplace.bank.transaction.Transaction;
import by.marketplace.bank.transaction.TransactionError;
import by.marketplace.bank.transaction.TransactionException;
import by.marketplace.misc.Entity;
/**
 * Banking account
 * 
 * @author A.Lagunov
 *
 */
public class Account {
	
	private long name;
	
	private AccountType type;
	
	private ArrayList<Transaction> transactions;
	
	boolean isFrozen;
	
	public Account(AccountType type, long name) {
		
		this.type = type;
		
		this.setName(name);
	}
	
	public boolean isFrozen() {
		return isFrozen;
	}

	public void setFrozen(boolean isFrozen) {
		this.isFrozen = isFrozen;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	
	protected void debit(Assets asset, Account source) throws TransactionException{
		if (source.type==this.type) {
			//!!!!!;
		}
		if (!isFrozen) {
			this.transactions.add(new Debit(asset, source));
		} else {
			throw new TransactionException(TransactionError.DESTINATION_IS_FROZEN);
		}
	}
	
	protected void credit(Assets asset, Account destination) throws TransactionException {
		if (!isFrozen) {
			this.transactions.add(new Credit(asset, destination));
		} else {
			throw new TransactionException(TransactionError.SOURCE_IS_FROZEN);
		}
	}

	public long getName() {
		return name;
	}

	public void setName(long name) {
		this.name = name;
	}
}
