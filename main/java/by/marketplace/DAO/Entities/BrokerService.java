package by.marketplace.DAO.Entities;

import javax.persistence.*;

@Entity
@Table(name = "brok_service")
public class BrokerService {

	@Id
	@Column(name = "service_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	@JoinColumn(name = "brok_id")
	private Broker broker;
	
	@Column(name = "service_name")
	private String name;
	
	@Column(name = "service_descr")
	private String description;
	
	@OneToOne
	@JoinColumn(name = "service_pricing_type_id")
	private PricingType pricingType;
	
	@Column(name = "fee")
	private double fee;
	
	@OneToOne
	@JoinColumn(name = "currency_id")
	private Currency currency;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Broker getBroker() {
		return broker;
	}

	public void setBroker(Broker broker) {
		this.broker = broker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public PricingType getPricingType() {
		return pricingType;
	}

	public void setPricingType(PricingType pricingType) {
		this.pricingType = pricingType;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	
}
