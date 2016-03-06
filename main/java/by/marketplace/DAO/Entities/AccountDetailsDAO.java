package by.marketplace.DAO.Entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name = "account_details")
public class AccountDetailsDAO {

	@Id
	@Column(name = "acc_det_id")
	private int id;
	
	@MapsId
	@OneToOne
	@JoinColumn(name = "acc_det_id")
	private AccountDAO account;

	@Column(name = "frozen")
	private boolean isFrozen = true;

	@ManyToOne
	@JoinColumn(name = "asset_id")
	private AssetDAO asset;
	
	@Column(name = "asset_quantity")
	private int quantity;
	
	public AssetDAO getAsset() {
		return asset;
	}

	public void setAsset(AssetDAO asset) {
		this.asset = asset;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public AccountDAO getAccount() {
		return account;
	}

	public void setAccount(AccountDAO account) {
		this.account = account;
	}

	public boolean isFrozen() {
		return isFrozen;
	}

	public void setFrozen(boolean isFrozen) {
		this.isFrozen = isFrozen;
	}

}
