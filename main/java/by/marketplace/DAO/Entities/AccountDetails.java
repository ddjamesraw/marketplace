package by.marketplace.DAO.Entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name = "account_details")
public class AccountDetails {

	@Id
	@Column(name = "acc_det_id")
	private int id;
	
	@MapsId
	@OneToOne
	@JoinColumn(name = "acc_det_id")
	private Account account;

	@Column(name = "frozen")
	private boolean isFrozen = true;

	@ManyToOne
	@JoinColumn(name = "asset_id")
	private Asset asset;
	
	@Column(name = "asset_quantity")
	private int quantity;
	
	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public boolean isFrozen() {
		return isFrozen;
	}

	public void setFrozen(boolean isFrozen) {
		this.isFrozen = isFrozen;
	}

}
