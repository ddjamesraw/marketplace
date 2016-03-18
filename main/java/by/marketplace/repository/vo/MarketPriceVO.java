package by.marketplace.repository.vo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "market_price")
public class MarketPriceVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2641895275283327357L;

	@Id
	@OneToOne
	@JoinColumn(name = "asset_id")
	@NotNull
	private AssetVO asset;
	
	@Column(name = "price")
	private double price;
	
	@OneToOne
	@JoinColumn(name = "currency_id")
	@NotNull
	private CurrencyVO currency;
	
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
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
		return ((MarketPriceVO) o).getAsset().getId()==this.getAsset().getId();
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

	public AssetVO getAsset() {
		return asset;
	}

	public void setAsset(AssetVO asset) {
		this.asset = asset;
	}

	public CurrencyVO getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyVO currency) {
		this.currency = currency;
	}

}
