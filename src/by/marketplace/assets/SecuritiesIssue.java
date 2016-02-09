package by.marketplace.assets;

import java.util.Date;

import by.marketplace.entities.Entity;

/**
 * Class represent abstract securities issue
 * @author A.Lagunov
 *
 */
public abstract class SecuritiesIssue{

	/**
	 * Issuer
	 */
	private Entity issuer;
	
	/**
	 * Ticker
	 */	
	private String ticker;
	
	/**
	 * Registration date
	 */
	private Date regdate;

	/**
	 * registration number
	 */
	private String regNumber;
	
	/**
	 * Code of issue
	 */
	private String code;
	
	/**
	 * Number of issue
	 */
	private int number;
	
	/**
	 * series of issue (batch?)
	 */
	private String batch;
	
	/**
	 * nominal monetary value
	 */
	private double nominalValue;
	
	/**
	 * Nominal currency
	 */
	private Currency currency;
	
	/**
	 * Volume of issue
	 */
	private double volume;
	
	/**
	 * Quantity
	 */
	private int quantity;
	
	/**
	 * Date of storing
	 */
	private Date storeDate;

	public Entity getIssuer() {
		return issuer;
	}

	public void setIssuer(Entity issuer) {
		this.issuer = issuer;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
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

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
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

}
