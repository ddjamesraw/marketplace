package by.marketplace.DAO.Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "market_price")
public class MarketPrice implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2641895275283327357L;

	@Id
	@OneToOne
	@JoinColumn(name = "asset_id")
	private Asset asset;
	
	@Column(name = "price")
	private double price;
	
	@OneToOne
	@JoinColumn(name = "currency_id")
	private Currency currency;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;

	@Override
	public int hashCode() {
		int hash = this.getAsset().getId();
		
		hash = hash * 17;
		hash = hash + Integer.bitCount(hash);
		
		return hash;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o==null) return false;
		if (o.getClass()!=this.getClass()) return false;
		if (o==this) return true;
		return ((MarketPrice) o).getAsset().getId()==this.getAsset().getId();
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

}
