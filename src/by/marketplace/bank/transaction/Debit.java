package by.marketplace.bank.transaction;

import by.marketplace.assets.Asset;
import by.marketplace.bank.account.Account;
/**
 * Account is debited when it is the destination
 * to which an asset is transfered
 * 
 * Every 'debere' operation has the source from 
 * which an asset is retrieved
 * 
 * @author A.Lagunov
 *
 */
public class Debit extends Transaction{

	public Account getSource() {
		return source;
	}

	public void setSource(Account source) {
		this.source = source;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	private Account source;
	
	private Asset asset;
	
	public Debit(Asset asset, Account source) {
		super(asset);
		this.source = source;
	}

}
