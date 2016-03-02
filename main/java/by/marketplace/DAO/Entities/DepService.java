package by.marketplace.DAO.Entities;

import javax.persistence.*;

@Entity
@Table(name = "dep_service")
public class DepService {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "service_id")
	private int id;
	
	@OneToOne
	@JoinColumn(name = "dep_id")
	private Depository depository;
	
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

	public Depository getDepository() {
		return depository;
	}

	public void setDepository(Depository depository) {
		this.depository = depository;
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
