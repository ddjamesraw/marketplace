package by.marketplace.DAO.Entities;

import javax.persistence.*;

@Entity
@Table(name = "account_security_group")
public class AccountSecurityGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "security_group_id")
	private int id;
	
	@Column(name = "security_group_name")
	private String name;
	
	@OneToOne
	@JoinColumn(name = "security_policy_id")
	private SecurityPolicy securityPolicy;
	
	@OneToOne
	@JoinColumn(name = "entity_group_id")
	private EntityGroup entityGroup;
	
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

	public SecurityPolicy getSecurityPolicy() {
		return securityPolicy;
	}

	public void setSecurityPolicy(SecurityPolicy securityPolicy) {
		this.securityPolicy = securityPolicy;
	}

	public EntityGroup getEntityGroup() {
		return entityGroup;
	}

	public void setEntityGroup(EntityGroup entityGroup) {
		this.entityGroup = entityGroup;
	}
	
}
