package by.marketplace.assets;

import java.util.Date;

public class Bonds extends Asset implements MonetaryValue, Tradeable{

	/**
	 * What issue bonds are belong to
	 */
	private final BondsIssue issue;

	/**
	 * Life cycle of this concrete coupon
	 * in DAYS
	 */
	private int couponLifeCycle;
	
	/**
	 * Coupon maturity date
	 * @param issue
	 * @param quantity
	 */
	private Date couponMaturityDate;
	
	
	
	public Bonds(BondsIssue issue) {
		this.issue = issue;
	}



	public int getCouponLifeCycle() {
		return couponLifeCycle;
	}



	public void setCouponLifeCycle(int couponLifeCycle) {
		this.couponLifeCycle = couponLifeCycle;
	}



	public Date getCouponMaturityDate() {
		return couponMaturityDate;
	}



	public void setCouponMaturityDate(Date couponMaturityDate) {
		this.couponMaturityDate = couponMaturityDate;
	}



	@Override
	public String getId() {
		return this.issue.getCode();
	}


	
	@Override
	public Money getNominalMonetaryValue() {
		return null;
	}



	@Override
	public int compareTo(Asset value) throws ClassCastException {
		return this.getNominalMonetaryValue().compareTo(value.getNominalMonetaryValue());
	}

}
