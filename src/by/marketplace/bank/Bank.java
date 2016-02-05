package by.marketplace.bank;

import java.util.ArrayList;
import java.util.TreeMap;

import by.marketplace.bank.account.Account;
import by.marketplace.bank.account.BankAccountFactory;
import by.marketplace.misc.*;
import by.marketplace.misc.Entity;

/**
 * Objects of this class represent banks 
 * 
 * @author A.Lagunov
 *
 */
public class Bank {
	
	private BankAccountFactory accountFactory;
	
	private TreeMap<Identifier,ArrayList<Account>> accounts = new TreeMap<Identifier,ArrayList<Account>>();
	
	private String name;
	
	private String code;	
	
	public Bank() {
		
		this.accountFactory = new BankAccountFactory(this);
		
		
	}
	
	public String getCode() {
		return code;
	}
	
	/**
	 * Returns how much accounts are held by the holder
	 */
	public int getAccountsCount(Entity holder) {
		if (accounts.containsKey(holder.getId())) {
			return accounts.get(holder.getId()).size(); 
		}
		return 0;
	}
}
