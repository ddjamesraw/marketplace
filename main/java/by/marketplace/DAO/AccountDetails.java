package by.marketplace.DAO;

import java.util.HashMap;
import java.util.Map;
import javax.persistence.*;

@Entity
@Table(name = "account_details")
public class AccountDetails {

	@Id
	@OneToOne(mappedBy = "acc_id")
	private Account account;
	
	@ElementCollection
	@CollectionTable(name = "account_details")
	@MapKeyColumn(name = "id")
	private Map<Asset,Integer> assets = new HashMap<Asset,Integer>();
	
	@Column(name = "frozen")
	private boolean isFrozen;

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

	public Map<Asset,Integer> getAssets() {
		return assets;
	}

	public void setAssets(Map<Asset,Integer> assets) {
		this.assets = assets;
	}

}
