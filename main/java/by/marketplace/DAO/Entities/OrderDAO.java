package by.marketplace.DAO.Entities;

import javax.persistence.*;

@Entity
@Table(name = "order_table")
public class OrderDAO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@OneToOne
	@JoinColumn(name = "asset_id")
	private AssetDAO asset;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "price_per_unit")
	private double pricePerUnit;
	
	@OneToOne
	@JoinColumn(name = "currency_id")
	private CurrencyDAO currency;
	
	@OneToOne
	@JoinColumn(name = "order_type_id")
	private OrderTypeDAO orderType;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private UserDAO user;
	
	@OneToOne
	@JoinColumn(name = "brok_id")
	private BrokerDAO broker;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AssetDAO getAsset() {
		return asset;
	}

	public void setAsset(AssetDAO asset) {
		this.asset = asset;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public CurrencyDAO getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyDAO currency) {
		this.currency = currency;
	}

	public OrderTypeDAO getOrderType() {
		return orderType;
	}

	public void setOrderType(OrderTypeDAO orderType) {
		this.orderType = orderType;
	}

	public UserDAO getUser() {
		return user;
	}

	public void setUser(UserDAO user) {
		this.user = user;
	}

	public BrokerDAO getBroker() {
		return broker;
	}

	public void setBroker(BrokerDAO broker) {
		this.broker = broker;
	}
	
}
