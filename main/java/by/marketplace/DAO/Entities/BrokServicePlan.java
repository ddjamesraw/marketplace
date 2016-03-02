package by.marketplace.DAO.Entities;

import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name = "brok_service_plan")
public class BrokServicePlan {

	@Id
	@Column(name = "service_plan_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "subscription_fee")
	private double subscriptionFee;
	
	@OneToOne
	@JoinColumn(name = "currency_id")
	private Currency currency;
	
	@OneToOne
	@JoinColumn(name = "brok_id")
	private Broker broker;

	@OneToMany
	@JoinTable(name = "brok_serv_join_plan",
			joinColumns = @JoinColumn(name = "serv_plan_id"), 
			inverseJoinColumns = @JoinColumn(name = "serv_id"))
	private Collection<BrokerService> services;
	
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

	public Broker getBroker() {
		return broker;
	}

	public void setBroker(Broker broker) {
		this.broker = broker;
	}

	public Collection<BrokerService> getServices() {
		return services;
	}

	public void setServices(Collection<BrokerService> services) {
		this.services = services;
	}
	
}
