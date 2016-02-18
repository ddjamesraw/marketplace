package by.marketplace.DAO;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToOne(mappedBy = "acc_id")
	private AccountDetails details;
	
	@Column(name = "holder_id")
	@OneToOne(mappedBy = "id")
	private Entity holder;
	
	@Column(name = "owner_id")
	@OneToOne(mappedBy = "id")
	private Entity owner;
	
	@Column(name = "acc_type_id")
	@OneToOne(mappedBy = "acc_type_id")
	private AccountType accountType;
	
	@Temporal(TemporalType.TIMESTAMP)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Date regDate;
	
	public AccountDetails getDetails() {
		return details;
	}

	public void setDetails(AccountDetails details) {
		this.details = details;
	}

	public Entity getHolder() {
		return holder;
	}

	public void setHolder(Entity holder) {
		this.holder = holder;
	}

	public Entity getOwner() {
		return owner;
	}

	public void setOwner(Entity owner) {
		this.owner = owner;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

}
