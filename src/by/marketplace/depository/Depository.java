package by.marketplace.depository;

import java.util.ArrayList;
import java.util.Map;

import by.marketplace.bank.account.Account;
import by.marketplace.entities.FinancialInstitution;
import by.marketplace.entities.Identifier;

/**
 * <p>Objects of this class are only accessible 
 * through <b>Depositories</b> static class
 * @author A.Lagunov
 *
 */
public class Depository extends FinancialInstitution {

	private Map<Identifier,ArrayList<Account>> accounts;
	
	public Depository(Identifier id) {
		super(id);
	}

}
