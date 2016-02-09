package by.marketplace.assets;

import java.util.Date;

public class Bonds extends Asset implements MonetaryValue, Tradeable{

	/**
	 * What issue bonds are belong to
	 */
	private final BondsIssue issue;
	
	/**
	 * How much coupons does this concrete
	 * asset include
	 */
	private int couponQty;
	
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
	
	
	
	public Bonds(BondsIssue issue, int qty) {
		this.issue = issue;
		this.couponQty = qty;
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
		return new Money(this.issue.getNominalValue()*this.couponQty,this.issue.getCurrency());
	}



	@Override
	public int compareTo(Asset value) throws ClassCastException {
		return this.getNominalMonetaryValue().compareTo(value.getNominalMonetaryValue());
	}

}
