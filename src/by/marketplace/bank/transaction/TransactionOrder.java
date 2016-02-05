package by.marketplace.bank.transaction;

import by.marketplace.assets.Assets;
import by.marketplace.bank.BankingOrder;
import by.marketplace.bank.account.Account;

public class TransactionOrder implements BankingOrder {

	private Account source;
	
	private Account destination;
	
	private Assets assets;
	
	public TransactionOrder(Account source, Account destination, Assets assets) {
		
		this.source = source;
		
		this.destination = destination;
		
		this.assets = assets;
		
	}

	@Override
	public void execute() {
		try {
			this.source.credit(assets, destination);
			this.destination.debit(assets, source);
		} catch (TransactionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
