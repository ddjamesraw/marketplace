package by.marketplace.repository.vo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "account_security_group")
public class AccountSecurityGroupVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "security_group_id")
	private int id;
	
	@Column(name = "security_group_name")
	@NotNull
	private String name;
	
	@OneToOne
	@JoinColumn(name = "security_policy_id")
	@NotNull
	private SecurityPolicyVO securityPolicy;
	
	@OneToOne
	@JoinColumn(name = "entity_group_id")
	@NotNull
	private EntityGroupVO entityGroup;
	
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

	public SecurityPolicyVO getSecurityPolicy() {
		return securityPolicy;
	}

	public void setSecurityPolicy(SecurityPolicyVO securityPolicy) {
		this.securityPolicy = securityPolicy;
	}

	public EntityGroupVO getEntityGroup() {
		return entityGroup;
	}

	public void setEntityGroup(EntityGroupVO entityGroup) {
		this.entityGroup = entityGroup;
	}
	
}
