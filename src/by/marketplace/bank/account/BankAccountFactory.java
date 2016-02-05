package by.marketplace.bank.account;

import by.marketplace.bank.Bank;
import by.marketplace.misc.Entity;

/**
 * Factory
 * @author A.Lagunov
 *
 */
public class BankAccountFactory {
	/**
	 * Bank which creates account
	 */
	private Bank bank;
	
	/**
	 * Factory should be connected with bank to which
	 * it produces accounts
	 * @param bank
	 */
	public BankAccountFactory(Bank bank) {
		this.bank = bank;
	}
	
	public Account createAccountFor(Entity holder,AccountType aType) {
		/**
		 * Serial number of an account
		 */
		int sN = bank.getAccountsCount(holder);
		
		/**
		 * Generating name for an account
		 */
		long name = generateName(sN,aType);
				
		/**
		 * Returning created account
		 */
		return new Account(aType,name);
	}
	
	/**
	 * Generates name for an account following rules specified
	 * at @see http://pravo.levonevsky.org/bazaby11/republic00/text301.htm
	 * @param int sN, AccountType type
	 * @return
	 */
	private long generateName(int sN, AccountType aType) {

		StringBuilder sb = new StringBuilder(bank.getCode());
		
		sb.append(String.valueOf(aType.getMask()*1000000000+sN*10));
		
		int key1 = Integer.parseInt(sb.substring(0, 3))*713;
		
		int key2 = Integer.parseInt(sb.substring(3, 6))*371;
		
		int key3 = Integer.parseInt(sb.substring(6, 9))*371;
		
		int key4 = Integer.parseInt(sb.substring(9, 12))*371;
		
		int key5 = Integer.parseInt(sb.substring(12, 15))*371;
		
		int key = ((key1 % 10 + key2 % 10 + key3 % 10 + key4 % 10 + key5 % 10)*3)%10;
		
		sb.replace(15, 16, String.valueOf(key));
		
		return Long.parseLong(sb.toString());
	}
	
	

}
