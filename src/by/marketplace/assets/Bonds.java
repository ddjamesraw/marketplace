package by.marketplace.assets;

import java.util.Date;

public class Bonds extends Assets implements MonetaryValue{

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
	
	
	
	public Bonds(BondsIssue issue, int quantity) {
		super(new BondsMonetaryValue(issue.getCurrency(),quantity,issue.getNominalValue()));
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

}
