package by.marketplace.bank.transaction;

import by.marketplace.assets.Asset;
import by.marketplace.bank.account.Account;

/**
 * Credit is a type of transaction when targeted account
 * is acting as the source of assets being transfered.
 * 
 * Every 'credite' operation has destination account
 * to which assets are to be transfered
 * 
 * @author A.Lagunov
 *
 */

public class Credit extends Transaction {
	
	private Account destination;
	
	private Asset asset;
	
	public Credit(Asset asset, Account destination) {
		super(asset);
		this.destination = destination;
	}

	public Account getDestination() {
		return destination;
	}

	public void setDestination(Account destination) {
		this.destination = destination;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	@Override
	public int compareTo(Transaction transaction) {
		return this.getAsset().getNominalMonetaryValue().compareTo(transaction.getAsset().getNominalMonetaryValue());
	}

}
