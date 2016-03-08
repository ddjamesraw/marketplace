package by.marketplace.logic;

import java.util.Date;

public interface User {
	
	public int getId();
	
	public String getAddress();
	public void setAddress(String address);
	
	public String getCity();
	public void setCity(String city);
	
	public String getPhone();
	public void setPhone(String phone);
	
	public String getEmail();
	public void setEmail(String email);
	
	public Date getRegdate();
	public void setRegdate(Date regdate);
	
}
