package by.marketplace.account;

import java.io.Serializable;
import java.util.ArrayList;

import by.marketplace.util.*;
import by.marketplace.assets.Asset;
import by.marketplace.transaction.Transaction;

public class Account implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5769453449619547439L;
	
	private Queue<Transaction> transactionsPending = new Queue<Transaction>();
	
	private ArrayList<Transaction> transactionsSettled;
	
	private ArrayList<Asset> assets;
	
	public Account() {
		
	}
	
	public void addTransaction(Transaction newTransaction) {
		transactionsPending.enqueue(newTransaction);
	}
	
	public void settle() {
		for (Transaction t:transactionsPending) {
			
		}
	}

}
