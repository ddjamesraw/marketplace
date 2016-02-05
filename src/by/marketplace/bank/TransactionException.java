package by.marketplace.bank;

public class TransactionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private TransactionErrorCode tec;
	
	public TransactionException(TransactionErrorCode tec) {
		this.tec = tec;
	}

}
