package by.marketplace.repository.vo;

import java.util.Collection;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "dep_service_plan")
public class DepServicePlanVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "service_plan_id")
	private int id;
	
	@Column(name = "subscription_fee")
	private double subscriptionFee;
	
	@OneToOne
	@JoinColumn(name = "currency_id")
	@NotNull
	private CurrencyVO currency;
	
	@OneToOne
	@JoinColumn(name = "dep_id")
	@NotNull
	private DepositoryVO depository;
	
	@OneToMany
	@JoinTable(name = "dep_service_join_plan",
			joinColumns = @JoinColumn(name = "service_plan_id"), 
			inverseJoinColumns = @JoinColumn(name = "service_id"))
	private Collection<DepServiceVO> services;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSubscriptionFee() {
		return subscriptionFee;
	}

	public void setSubscriptionFee(double subscriptionFee) {
		this.subscriptionFee = subscriptionFee;
	}

	public CurrencyVO getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyVO currency) {
		this.currency = currency;
	}

	public DepositoryVO getDepository() {
		return depository;
	}

	public void setDepository(DepositoryVO depository) {
		this.depository = depository;
	}

}
