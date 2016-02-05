package by.marketplace.bank;

import java.util.TreeMap;

import by.marketplace.bank.account.Account;
import by.marketplace.misc.Identifier;

/**
 * Singleton class which represents the central bank
 * 
 * 
 * @author A.Lagunov
 *
 */
public class CentralBank {
	/**
	 * Instance of class
	 */
	CentralBank centralBank = null;
	
	/**
	 * Accounts which central bank holds for other banks
	 */
	TreeMap<Identifier,Account> accounts = new TreeMap<Identifier,Account>();
	
	
	/**
	 * Should not be instantiated from outside
	 */
	private CentralBank() {
		
	}
	
	/**
	 * Get instance
	 */
	public CentralBank getInstance() {
		if (centralBank==null) {
			centralBank = new CentralBank();
		}
		return this;
	}
}
