package by.marketplace.DAO.Entities;

import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name = "dep_service_plan")
public class DepServicePlan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "service_plan_id")
	private int id;
	
	@Column(name = "subscription_fee")
	private double subscriptionFee;
	
	@OneToOne
	@JoinColumn(name = "currency_id")
	private Currency currency;
	
	@OneToOne
	@JoinColumn(name = "dep_id")
	private Depository depository;
	
	@OneToMany
	@JoinTable(name = "dep_service_join_plan",
			joinColumns = @JoinColumn(name = "service_plan_id"), 
			inverseJoinColumns = @JoinColumn(name = "service_id"))
	private Collection<DepService> services;

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

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Depository getDepository() {
		return depository;
	}

	public void setDepository(Depository depository) {
		this.depository = depository;
	}

}
