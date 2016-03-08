package by.marketplace.DAO.entities;

import javax.persistence.*;

@Entity
@Table(name = "security_policy")
public class SecurityPolicyDAO {

	@Id
	@Column(name = "security_policy_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "security_policy_name")
	private String name;
	
	@Column(name = "debit_allowed")
	private boolean debitAllowed;
	
	@Column(name = "credit_allowed")
	private boolean creditAllowed;
	
	@Column(name = "peek_allowed")
	private boolean peekAllowed;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isDebitAllowed() {
		return debitAllowed;
	}

	public void setDebitAllowed(boolean debitAllowed) {
		this.debitAllowed = debitAllowed;
	}

	public boolean isCreditAllowed() {
		return creditAllowed;
	}

	public void setCreditAllowed(boolean creditAllowed) {
		this.creditAllowed = creditAllowed;
	}

	public boolean isPeekAllowed() {
		return peekAllowed;
	}

	public void setPeekAllowed(boolean peekAllowed) {
		this.peekAllowed = peekAllowed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
