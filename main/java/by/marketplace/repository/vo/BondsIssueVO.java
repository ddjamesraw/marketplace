package by.marketplace.repository.vo;

import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "bond_issue")
@DiscriminatorValue("2")
public class BondsIssueVO extends AssetVO{
	
	@Column(name = "ticker", length = 45)
	@NotNull
	private String ticker;

	@Column(name = "regdate")
	@Temporal(TemporalType.DATE)
	private Date regDate;
	
	@Column(name = "regnumber", length = 45)
	private String regnumber;
	
	@Column(name = "code", length = 45)
	private String code;
	
	@Column(name = "number")
	private int number;
	
//	@Column(name = "batch", length = 45)
//	private String batch;
	
	@Column(name = "nominal_value")
	@NotNull
	private double nominalValue;
	
	@ManyToOne
	@JoinColumn(name = "currency_id")
	@NotNull
	private CurrencyVO currency;

	@Column(name = "volume")
	@NotNull
	private long volume;
	
	@Column(name = "quantity")
	@NotNull
	private int quantity;
	
	@Column(name = "store_date")
	@Temporal(TemporalType.DATE)
	private Date storeDate;

	@Column(name = "lifecycle")
	private int lifeCycle;

	@Column(name = "maturity_date")
	@Temporal(TemporalType.DATE)
	private Date issueMaturityDate;
	
	@Column(name = "interest_rate")
	private double interestRate;

	public CurrencyVO getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyVO currency) {
		this.currency = currency;
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

	public String getRegnumber() {
		return regnumber;
	}

	public void setRegnumber(String regnumber) {
		this.regnumber = regnumber;
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
//
//	public String getBatch() {
//		return batch;
//	}
//
//	public void setBatch(String batch) {
//		this.batch = batch;
//	}

	public double getNominalValue() {
		return nominalValue;
	}

	public void setNominalValue(double nominalValue) {
		this.nominalValue = nominalValue;
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

	public int getLifeCycle() {
		return lifeCycle;
	}

	public void setLifeCycle(int lifeCycle) {
		this.lifeCycle = lifeCycle;
	}

	public Date getIssueMaturityDate() {
		return issueMaturityDate;
	}

	public void setIssueMaturityDate(Date issueMaturityDate) {
		this.issueMaturityDate = issueMaturityDate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public long getVolume() {
		return volume;
	}

	public void setVolume(long volume) {
		this.volume = volume;
	}

}
