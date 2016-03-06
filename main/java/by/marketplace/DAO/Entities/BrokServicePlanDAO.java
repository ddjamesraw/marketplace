package by.marketplace.DAO.Entities;

import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name = "brok_service_plan")
public class BrokServicePlanDAO {

	@Id
	@Column(name = "service_plan_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "subscription_fee")
	private double subscriptionFee;
	
	@OneToOne
	@JoinColumn(name = "currency_id")
	private CurrencyDAO currency;
	
	@OneToOne
	@JoinColumn(name = "brok_id")
	private BrokerDAO broker;

	@OneToMany
	@JoinTable(name = "brok_serv_join_plan",
			joinColumns = @JoinColumn(name = "serv_plan_id"), 
			inverseJoinColumns = @JoinColumn(name = "serv_id"))
	private Collection<BrokerServiceDAO> services;
	
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

	public CurrencyDAO getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyDAO currency) {
		this.currency = currency;
	}

	public BrokerDAO getBroker() {
		return broker;
	}

	public void setBroker(BrokerDAO broker) {
		this.broker = broker;
	}

	public Collection<BrokerServiceDAO> getServices() {
		return services;
	}

	public void setServices(Collection<BrokerServiceDAO> services) {
		this.services = services;
	}
	
}
