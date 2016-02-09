package by.marketplace.bank.account;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import by.marketplace.util.*;
import by.marketplace.assets.Asset;
import by.marketplace.bank.transaction.Transaction;

public class Account implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5769453449619547439L;
	
	private Queue<Transaction> transactionsPending;
	
	private ArrayList<Transaction> transactionsSettled;
	
	private ArrayList<Asset> assets;
	
	public Account() {
		
	}
	
	public void addTransaction(Transaction newTransaction) {
		if (transactionsPending==null) {
			transactionsPending = new Queue<Transaction>();
			transactionsPending.enqueue(newTransaction);
		} else {
			transactionsPending.enqueue(newTransaction);
		}
	}
	
	public void settle() {
		for (Transaction t:transactionsPending) {
			
		}
	}

}
