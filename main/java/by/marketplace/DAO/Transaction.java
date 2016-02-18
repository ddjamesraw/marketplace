package by.marketplace.DAO;

import java.util.Date;

public class Transaction {

	private int id;
	
	private int sourceAccountId;
	
	private int destAccountId;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setSourceAccountId(int sourceAccountId) {
		this.sourceAccountId = sourceAccountId;
	}

	public void setDestAccountId(int destAccountId) {
		this.destAccountId = destAccountId;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public void setType(TransactionType type) {
		this.type = type;
	}

	private Date timestamp;
	
	public Date getTimestamp() {
		return timestamp;
	}

	public int getId() {
		return id;
	}

	public int getSourceAccountId() {
		return sourceAccountId;
	}

	public int getDestAccountId() {
		return destAccountId;
	}

	public TransactionType getType() {
		return type;
	}

	private TransactionType type;

}

enum TransactionType {
	debit,credit
}
