package by.marketplace.bank.transaction;

import java.util.Date;

import by.marketplace.assets.Asset;
/**
 * Descendants of this class represent transactions
 * Every transaction have an asset ownership of which
 * is to be transacted and a timestamp representing
 * time at which transaction is performed
 * @author A.Lagunov
 *
 */
public abstract class Transaction implements Comparable<Transaction> {
	
	private boolean settled;
	
	private Asset asset;
	
	private Date timestamp;
	
	public Transaction(Asset asset) {
		this.timestamp = new Date(System.currentTimeMillis());
		this.asset = asset;
		this.setSettled(false);
	}
	
	public abstract int compareTo(Transaction transaction);
	
	public Asset getAsset() {
		return asset;
	}
	
	public void setAsset(Asset asset) {
		this.asset = asset;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public boolean isSettled() {
		return settled;
	}

	public void setSettled(boolean settled) {
		this.settled = settled;
	}

}
