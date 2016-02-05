package by.marketplace.assets;
/**
 * Represents concrete quantity of shares
 * of some issue
 * 
 * @author A.Lagunov
 *
 */
public class Shares extends Assets implements MonetaryValue{

	private SharesIssue issue;
	
	private int quantity;
	
	public Shares(SharesIssue issue, int quantity) {
		super(new SharesMonetaryValue(issue.getCurrency(),quantity,issue.getNominalValue()));
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
	public boolean equals(Object o) {
		try {
			Shares share = (Shares) o;
			if (share.issue.equals(this.issue) && share.quantity==this.quantity) {
				return true;
			}
		} catch (ClassCastException e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}

}
