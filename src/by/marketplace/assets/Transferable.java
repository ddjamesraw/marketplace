package by.marketplace.assets;

import by.marketplace.bank.account.Account;

/**
 * Объекты, реализующие данный интерфейс могут быть переведены
 * с одного счёта на другой
 * 
 * @author A.Lagunov
 *
 */
interface Transferable {
	public void transfer(Account to);
}
