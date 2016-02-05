package by.marketplace.bank;

import java.util.ArrayList;
import java.util.TreeMap;

import by.marketplace.misc.*;
import by.marketplace.misc.Entity;

/**
 * Objects of this class represent banks 
 * 
 * @author A.Lagunov
 *
 */
public class Bank {
	
	private String name;
	private TreeMap<Identifier,ArrayList<Account>> accounts = new TreeMap<Identifier,ArrayList<Account>>();
	/**
	 * Add
	 * @param ownerId
	 */
	public void addAccount(Identifier ownerId) {
		if (this.accounts.containsKey(ownerId)) {
			this.accounts.get(ownerId).add(new Account());
		} else {
			this.accounts.put(ownerId, new ArrayList<Account>());
		}
	}

}
