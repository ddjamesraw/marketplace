package by.marketplace.entities;

import java.util.Date;

public class Passport implements Identifier{
	
	//Last name
	private String lname;
	
	//First name
	private String fname;
	
	//Date of birth
	private Date DOB;
	
	//Sex 'M'/'F'
	private char sex;
	
	//Looks like3151194G030PB5
	private String identificationNumber;
	
	//Looks like HB8102043
	private String passportNumber;
	
	//Date of issue
	private Date dateOfIssue;
	
	//Date of expiry
	private Date dateOfExpiry;
	
	//
	private String issuer;
	
	
	public Passport() {
		
	}

	@Override
	public boolean equals(Identifier id) {
		try {
			Passport passport = (Passport) id;
			if (this.identificationNumber==passport.identificationNumber) {
				return true;
			}
		} catch (ClassCastException e) {
			return false;
		}
		return false;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Date getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

}
