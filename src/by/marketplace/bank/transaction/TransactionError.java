package by.marketplace.bank.transaction;

public enum TransactionError {
	DESTINATION_IS_FROZEN("Счет получателя заблокирован"), 
	SOURCE_IS_FROZEN("Счет отправителя заблокирован"),
	ACCOUNT_NOT_EXISTS("Счет не существует"),
	INSUFFICIENT_ASSETS("Счет не содержит запрашиваемых активов"),
	WRONG_ACCOUNT_TYPE("Счёт не может принять активы даннного типа");
	TransactionError(String description) {
		this.description = description;
	}
	private String description;
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
}
