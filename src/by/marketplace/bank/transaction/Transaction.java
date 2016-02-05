package by.marketplace.bank.transaction;

import java.util.Date;

import by.marketplace.assets.Assets;
/**
 * Descendants of this class represent transactions
 * Every transaction have an asset ownership of which
 * is to be transacted and a timestamp representing
 * time at which transaction is performed
 * @author A.Lagunov
 *
 */
public abstract class Transaction {
	
	private Assets asset;
	
	private Date timestamp;
	
	public Transaction(Assets asset) {
		this.timestamp = new Date(System.currentTimeMillis());
		this.asset = asset;
	}
	
	public Assets getAsset() {
		return asset;
	}
	
	public void setAsset(Assets asset) {
		this.asset = asset;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

}
