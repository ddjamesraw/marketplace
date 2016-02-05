package by.marketplace.depository;

import java.util.Date;

import by.marketplace.assets.Asset;
import by.marketplace.bank.Account;

public class Transaction {
	
	private Account from;
	private Account to;
	private Asset amount;
	private String details;
	private Date timestamp;
	
	public Transaction() {
		
	}

}
