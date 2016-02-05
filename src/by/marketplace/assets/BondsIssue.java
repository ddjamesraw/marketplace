package by.marketplace.assets;

import java.util.Date;

import by.marketplace.misc.Entity;
/**
 * Object of this class represent concrete issues of bonds
 * 
 * @author A.Lagunov
 *
 */
public class BondsIssue extends SecuritiesIssue{
	
	public int getLifeCycle() {
		return lifeCycle;
	}

	public void setLifeCycle(int lifeCycle) {
		this.lifeCycle = lifeCycle;
	}

	public Date getIssueMaturityDate() {
		return issueMaturityDate;
	}

	public void setIssueMaturityDate(Date issueMaturityDate) {
		this.issueMaturityDate = issueMaturityDate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	/**
	 * Life cycle in DAYS
	 */
	private int lifeCycle;
	
	/**
	 * Date when issue can be payed for
	 */
	private Date issueMaturityDate;
	
	/**
	 * interest rate
	 */
	private double interestRate;
	
}
