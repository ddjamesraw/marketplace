package by.marketplace.DAO;

public class SecurityPolicy {

	private int id;
	
	private boolean debitAllowed;
	
	private boolean creditAllowed;
	
	private boolean peekAllowed;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isDebitAllowed() {
		return debitAllowed;
	}

	public void setDebitAllowed(boolean debitAllowed) {
		this.debitAllowed = debitAllowed;
	}

	public boolean isCreditAllowed() {
		return creditAllowed;
	}

	public void setCreditAllowed(boolean creditAllowed) {
		this.creditAllowed = creditAllowed;
	}

	public boolean isPeekAllowed() {
		return peekAllowed;
	}

	public void setPeekAllowed(boolean peekAllowed) {
		this.peekAllowed = peekAllowed;
	}

}
