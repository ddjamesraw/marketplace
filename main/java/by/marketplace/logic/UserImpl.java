package by.marketplace.logic;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import by.marketplace.DAO.entities.UserDAO;
import by.marketplace.DAO.util.Manager;

@XmlRootElement
public class UserImpl implements User {

	private int id;
	private String address;
	private String city;
	private String phone;
	private String email;
	private Date regdate;
	
	public UserImpl(UserDAO userDAO) {
		this.id = userDAO.getId();
		this.address = userDAO.getAddress();
		this.city = userDAO.getCity();
		this.phone = userDAO.getPhone();
		this.email = userDAO.getEmail();
		this.regdate = userDAO.getRegDate();
	}
	
	public UserImpl(){
		//nothing
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

}
