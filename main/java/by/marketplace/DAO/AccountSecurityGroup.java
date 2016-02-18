package by.marketplace.DAO;

public class AccountSecurityGroup {

	private int id;
	
	private String name;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public void setSecurityPolicyId(int securityPolicyId) {
		this.securityPolicyId = securityPolicyId;
	}

	public int getSecurityPolicyId() {
		return securityPolicyId;
	}

	private int accountId;
	
	private int securityPolicyId;
	
}
