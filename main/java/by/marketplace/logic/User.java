package by.marketplace.logic;

import java.util.Date;

import by.marketplace.repository.vo.UserVO;

public interface User extends ConstructableFromVo<UserVO> {
	
	public void setId(int id);
	public int getId();
	
	public void setCity(String city);
	public String getCity();
	
	public void setEmail(String email);
	public String getEmail();
	
	public void setPhone(String phone);
	public String getPhone();
	
	public void setRegdate(Date regdate);
	public Date getRegdate();
}