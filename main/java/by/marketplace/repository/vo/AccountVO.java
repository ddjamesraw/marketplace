package by.marketplace.repository.vo;

import java.util.Date;
import javax.persistence.*;

import javassist.bytecode.analysis.Type;

@Entity
@Table(name = "account")
public class AccountVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "acc_id")
	private int id;
	
	@OneToOne(mappedBy = "account", orphanRemoval = true, cascade = CascadeType.ALL)
	private AccountDetailsVO details;

	@ManyToOne
	@JoinColumn(name = "holder_id")
	private GenericEntityVO holder;

	@ManyToOne
	@JoinColumn(name = "owner_id")
	private GenericEntityVO owner;
	
	@ManyToOne
	@JoinColumn(name = "acc_type_id")
	private AccountTypeVO accountType;

	@Column(name = "reg_date")
	@Temporal(TemporalType.TIMESTAMP)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Date regDate;
	
	@OneToOne
	@JoinColumn(name = "acc_security_group")
	private AccountSecurityGroupVO securityGroup;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AccountSecurityGroupVO getSecurityGroup() {
		return securityGroup;
	}

	public void setSecurityGroup(AccountSecurityGroupVO securityGroup) {
		this.securityGroup = securityGroup;
	}

	public AccountDetailsVO getDetails() {
		return details;
	}

	public void setDetails(AccountDetailsVO details) {
		this.details = details;
	}

	public GenericEntityVO getHolder() {
		return holder;
	}

	public void setHolder(GenericEntityVO holder) {
		this.holder = holder;
	}

	public GenericEntityVO getOwner() {
		return owner;
	}

	public void setOwner(GenericEntityVO owner) {
		this.owner = owner;
	}

	public AccountTypeVO getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountTypeVO accountType) {
		this.accountType = accountType;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

}
