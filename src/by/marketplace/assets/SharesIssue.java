package by.marketplace.assets;

import java.util.Date;

import by.marketplace.entities.Entity;

public class SharesIssue extends SecuritiesIssue{

	/**
	 * Is privileged
	 */
	private boolean privileged;
	
	/**
	 * Registration date of additional issue
	 */
	private Date followOnDate;
	
	/**
	 * Volume of additional issue
	 */
	private double followOnVolume;
	
	/**
	 * Parly annulation
	 */
	private boolean partlyAnnulation;
	
	/**
	 * Date of storing
	 */
	private Date storeDate;
	
	public void setPrivileged(boolean privileged) {
		this.privileged = privileged;
	}

	public void setFollowOnDate(Date followOnDate) {
		this.followOnDate = followOnDate;
	}

	public void setFollowOnVolume(double followOnVolume) {
		this.followOnVolume = followOnVolume;
	}

	public void setPartlyAnnulation(boolean partlyAnnulation) {
		this.partlyAnnulation = partlyAnnulation;
	}

	public void setStoreDate(Date storeDate) {
		this.storeDate = storeDate;
	}

	public boolean isPrivileged() {
		return privileged;
	}

	public Date getFollowOnDate() {
		return followOnDate;
	}

	public double getFollowOnVolume() {
		return followOnVolume;
	}

	public boolean isPartlyAnnulation() {
		return partlyAnnulation;
	}

	public Date getStoreDate() {
		return storeDate;
	}
}
