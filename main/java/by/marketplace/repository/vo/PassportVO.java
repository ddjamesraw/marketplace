package by.marketplace.repository.vo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "passport")
public class PassportVO implements Serializable{
	
	private static final long serialVersionUID = 4385479281922113498L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "passport_id")
	private int passportId;
	
	@Column(name = "passport_sn", length = 45)
	@NotNull
	private String passportSN;
	

	@OneToOne
	@JoinColumn(name = "user_id")
	@NotNull
	private UserVO user;

	@Column(name = "fname", length = 45)
	@NotNull
	private String fname;
	
	@Column(name = "lname", length = 45)
	@NotNull
	private String lname;
	
	@Column(name = "sname", length = 45)
	private String sname;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dob")
	private Date DOB;
	
	@Column(name = "personal_id", length = 45)
	@NotNull
	private String personalID;
	
	@Column(name = "passport_issuer", length = 125)
	@NotNull
	private String passportIssuer;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_of_issue")
	@NotNull
	private Date passportRegDate;

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public void setPassportSN(String passportSN) {
		this.passportSN = passportSN;
	}

	public void setPersonalID(String personalID) {
		this.personalID = personalID;
	}

	public void setPassportIssuer(String passportIssuer) {
		this.passportIssuer = passportIssuer;
	}

	public void setPassportRegDate(Date passportRegDate) {
		this.passportRegDate = passportRegDate;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getSname() {
		return sname;
	}

	public Date getDOB() {
		return DOB;
	}

	public String getPassportSN() {
		return passportSN;
	}

	public String getPersonalID() {
		return personalID;
	}

	public String getPassportIssuer() {
		return passportIssuer;
	}

	public Date getPassportRegDate() {
		return passportRegDate;
	}

	public UserVO getUser() {
		return user;
	}

	public void setUser(UserVO user) {
		this.user = user;
	}
	
	@Override
	public int hashCode() {
		return this.DOB.hashCode() + (int) Math.random()*999999;
	}

}
