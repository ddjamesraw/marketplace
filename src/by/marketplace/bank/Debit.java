package by.marketplace.bank;

import by.marketplace.assets.Assets;
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

	public Assets getAsset() {
		return asset;
	}

	public void setAsset(Assets asset) {
		this.asset = asset;
	}

	private Account source;
	
	private Assets asset;
	
	public Debit(Assets asset, Account source) {
		super(asset);
		this.source = source;
	}

}
