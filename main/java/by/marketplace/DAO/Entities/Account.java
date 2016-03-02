package by.marketplace.DAO.Entities;

import java.util.Date;
import javax.persistence.*;

import javassist.bytecode.analysis.Type;

@Entity
@Table(name = "account")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "acc_id")
	private int id;
	
	@OneToOne(mappedBy = "account", orphanRemoval = true, cascade = CascadeType.ALL)
	private AccountDetails details;

	@ManyToOne
	@JoinColumn(name = "holder_id")
	private GenericEntity holder;

	@ManyToOne
	@JoinColumn(name = "owner_id")
	private GenericEntity owner;
	
	@ManyToOne
	@JoinColumn(name = "acc_type_id")
	private AccountType accountType;

	@Column(name = "reg_date")
	@Temporal(TemporalType.TIMESTAMP)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Date regDate;
	
	@OneToOne
	@JoinColumn(name = "acc_security_group")
	private AccountSecurityGroup securityGroup;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AccountSecurityGroup getSecurityGroup() {
		return securityGroup;
	}

	public void setSecurityGroup(AccountSecurityGroup securityGroup) {
		this.securityGroup = securityGroup;
	}

	public AccountDetails getDetails() {
		return details;
	}

	public void setDetails(AccountDetails details) {
		this.details = details;
	}

	public GenericEntity getHolder() {
		return holder;
	}

	public void setHolder(GenericEntity holder) {
		this.holder = holder;
	}

	public GenericEntity getOwner() {
		return owner;
	}

	public void setOwner(GenericEntity owner) {
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
