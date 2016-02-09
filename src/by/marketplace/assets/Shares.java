package by.marketplace.assets;
/**
 * Represents concrete quantity of shares
 * of some issue
 * 
 * @author A.Lagunov
 *
 */
public class Shares extends Asset implements MonetaryValue,Tradeable{

	private SharesIssue issue;
	
	private int quantity;
	
	public Shares(SharesIssue issue, int quantity) {
		this.issue = issue;
		this.quantity = quantity;
	}
	
	/**
	 * Returns NOMINAL monetary value for this quantity of shares
	 */
	@Override
	public Money getNominalMonetaryValue() {
		return new Money(issue.getNominalValue()*quantity, issue.getCurrency());
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(Asset value) throws ClassCastException {
		// TODO Auto-generated method stub
		return 0;
	}

}
