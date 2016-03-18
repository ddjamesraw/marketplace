package by.marketplace.repository.vo;

import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "share_issue")
@DiscriminatorValue("1")
public class SharesIssueVO extends AssetVO{
	
	@Column(name = "privileged")
	private boolean privileged;
	
	@Column(name = "ticker", length = 45)
	@NotNull
	private String ticker;
	
	@Column(name = "regdate")
	@Temporal(TemporalType.DATE)
	private Date regDate;
	
	@Column(name = "regnumber", length = 45)
	private String regNumber;
	
	@Column(name = "code", length = 45)
	private String code;
	
	@Column(name = "number", length = 11)
	private int number;
	
	@Column(name = "batch", length = 45)
	private String batch;
	
	@Column(name = "nominal_value")
	private double nominalValue;
	
	@ManyToOne
	@JoinColumn(name = "currency_id")
	@NotNull
	private CurrencyVO currency;
	
	@Column(name = "volume")
	private long volume;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "store_date")
	@Temporal(TemporalType.DATE)
	private Date storeDate;
	
	@Column(name = "followon_date")
	@Temporal(TemporalType.DATE)
	private Date followOnDate;
	
	@Column(name = "partial_annulation")
	private boolean partialAnnulation;

	public boolean isPrivileged() {
		return privileged;
	}

	public CurrencyVO getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyVO currency) {
		this.currency = currency;
	}

	public void setPrivileged(boolean privileged) {
		this.privileged = privileged;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public double getNominalValue() {
		return nominalValue;
	}

	public void setNominalValue(double nominalValue) {
		this.nominalValue = nominalValue;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(long volume) {
		this.volume = volume;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getStoreDate() {
		return storeDate;
	}

	public void setStoreDate(Date storeDate) {
		this.storeDate = storeDate;
	}

	public Date getFollowOnDate() {
		return followOnDate;
	}

	public void setFollowOnDate(Date followOnDate) {
		this.followOnDate = followOnDate;
	}

	public boolean isPartialAnnulation() {
		return partialAnnulation;
	}

	public void setPartialAnnulation(boolean partialAnnulation) {
		this.partialAnnulation = partialAnnulation;
	}

}
