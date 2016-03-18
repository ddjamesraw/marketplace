package by.marketplace.repository.vo;

import java.util.Collection;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "brok_service_plan")
public class BrokServicePlanVO {

	@Id
	@Column(name = "service_plan_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "subscription_fee")
	private double subscriptionFee;
	
	@OneToOne
	@JoinColumn(name = "currency_id")
	@NotNull
	private CurrencyVO currency;
	
	@OneToOne
	@JoinColumn(name = "brok_id")
	@NotNull
	private BrokerVO broker;

	@OneToMany
	@JoinTable(name = "brok_serv_join_plan",
			joinColumns = @JoinColumn(name = "serv_plan_id"), 
			inverseJoinColumns = @JoinColumn(name = "serv_id"))
	private Collection<BrokerServiceVO> services;
	
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

	public BrokerVO getBroker() {
		return broker;
	}

	public void setBroker(BrokerVO broker) {
		this.broker = broker;
	}

	public Collection<BrokerServiceVO> getServices() {
		return services;
	}

	public void setServices(Collection<BrokerServiceVO> services) {
		this.services = services;
	}
	
}
