package by.marketplace.transaction;

public class TransactionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private TransactionError tec;
	
	public TransactionException(TransactionError tec) {
		this.tec = tec;
	}

}
