package by.marketplace.repository.vo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "order_table")
public class OrderVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@OneToOne
	@JoinColumn(name = "asset_id")
	@NotNull
	private AssetVO asset;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "price_per_unit")
	private double pricePerUnit;
	
	@OneToOne
	@JoinColumn(name = "currency_id")
	@NotNull
	private CurrencyVO currency;
	
	@OneToOne
	@JoinColumn(name = "order_type_id")
	private OrderTypeVO orderType;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	@NotNull
	private UserVO user;
	
	@OneToOne
	@JoinColumn(name = "brok_id")
	@NotNull
	private BrokerVO broker;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AssetVO getAsset() {
		return asset;
	}

	public void setAsset(AssetVO asset) {
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

	public CurrencyVO getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyVO currency) {
		this.currency = currency;
	}

	public OrderTypeVO getOrderType() {
		return orderType;
	}

	public void setOrderType(OrderTypeVO orderType) {
		this.orderType = orderType;
	}

	public UserVO getUser() {
		return user;
	}

	public void setUser(UserVO user) {
		this.user = user;
	}

	public BrokerVO getBroker() {
		return broker;
	}

	public void setBroker(BrokerVO broker) {
		this.broker = broker;
	}
	
}
