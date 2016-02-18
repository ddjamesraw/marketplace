package by.marketplace.DAO;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@Column(unique = true, nullable = false, name = "id")
	private int id;

	@Column(name = "addr", length = 60)
	private String address;
	
	@Column(name = "city", length = 45)
	private String city;
	
	@Column(name = "phone", length = 45)
	private String phone;
	
	@Column(name = "email", length = 255)
	private String email;
	
	@Temporal(TemporalType.TIMESTAMP)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Date regDate;
	
	@OneToOne
	@JoinColumn(name = "passport_sn")
	private Passport passport;

	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public Date getRegDate() {
		return regDate;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Passport getPassport() {
		return passport;
	}

}
