package by.marketplace.DAO.Entities;

import javax.persistence.*;

@Entity
@Table(name = "account_security_group")
public class AccountSecurityGroupDAO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "security_group_id")
	private int id;
	
	@Column(name = "security_group_name")
	private String name;
	
	@OneToOne
	@JoinColumn(name = "security_policy_id")
	private SecurityPolicyDAO securityPolicy;
	
	@OneToOne
	@JoinColumn(name = "entity_group_id")
	private EntityGroupDAO entityGroup;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SecurityPolicyDAO getSecurityPolicy() {
		return securityPolicy;
	}

	public void setSecurityPolicy(SecurityPolicyDAO securityPolicy) {
		this.securityPolicy = securityPolicy;
	}

	public EntityGroupDAO getEntityGroup() {
		return entityGroup;
	}

	public void setEntityGroup(EntityGroupDAO entityGroup) {
		this.entityGroup = entityGroup;
	}
	
}
