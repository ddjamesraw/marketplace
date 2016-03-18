package by.marketplace.repository.vo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "brok_service")
public class BrokerServiceVO {

	@Id
	@Column(name = "service_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	@JoinColumn(name = "brok_id")
	@NotNull
	private BrokerVO broker;
	
	@Column(name = "service_name")
	@NotNull
	private String name;
	
	@Column(name = "service_descr")
	@NotNull
	private String description;
	
	@OneToOne
	@JoinColumn(name = "service_pricing_type_id")
	@NotNull
	private PricingTypeVO pricingType;
	
	@Column(name = "fee")
	private double fee;
	
	@OneToOne
	@JoinColumn(name = "currency_id")
	private CurrencyVO currency;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BrokerVO getBroker() {
		return broker;
	}

	public void setBroker(BrokerVO broker) {
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

	public PricingTypeVO getPricingType() {
		return pricingType;
	}

	public void setPricingType(PricingTypeVO pricingType) {
		this.pricingType = pricingType;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public CurrencyVO getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyVO currency) {
		this.currency = currency;
	}
	
}
