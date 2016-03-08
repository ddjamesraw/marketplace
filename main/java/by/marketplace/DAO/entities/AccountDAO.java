package by.marketplace.DAO.entities;

import java.util.Date;
import javax.persistence.*;

import javassist.bytecode.analysis.Type;

@Entity
@Table(name = "account")
public class AccountDAO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "acc_id")
	private int id;
	
	@OneToOne(mappedBy = "account", orphanRemoval = true, cascade = CascadeType.ALL)
	private AccountDetailsDAO details;

	@ManyToOne
	@JoinColumn(name = "holder_id")
	private GenericEntityDAO holder;

	@ManyToOne
	@JoinColumn(name = "owner_id")
	private GenericEntityDAO owner;
	
	@ManyToOne
	@JoinColumn(name = "acc_type_id")
	private AccountTypeDAO accountType;

	@Column(name = "reg_date")
	@Temporal(TemporalType.TIMESTAMP)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Date regDate;
	
	@OneToOne
	@JoinColumn(name = "acc_security_group")
	private AccountSecurityGroupDAO securityGroup;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AccountSecurityGroupDAO getSecurityGroup() {
		return securityGroup;
	}

	public void setSecurityGroup(AccountSecurityGroupDAO securityGroup) {
		this.securityGroup = securityGroup;
	}

	public AccountDetailsDAO getDetails() {
		return details;
	}

	public void setDetails(AccountDetailsDAO details) {
		this.details = details;
	}

	public GenericEntityDAO getHolder() {
		return holder;
	}

	public void setHolder(GenericEntityDAO holder) {
		this.holder = holder;
	}

	public GenericEntityDAO getOwner() {
		return owner;
	}

	public void setOwner(GenericEntityDAO owner) {
		this.owner = owner;
	}

	public AccountTypeDAO getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountTypeDAO accountType) {
		this.accountType = accountType;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

}
