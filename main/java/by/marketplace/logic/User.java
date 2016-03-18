package by.marketplace.logic;

import java.util.Date;

import by.marketplace.repository.vo.UserVO;

public interface User {
	public void constructFromVO(Object userVO);
	public UserVO getVO();
	
	public void setCity(String city);
	public String getCity();
	
	public void setEmail(String email);
	public String getEmail();
	
	public void setPhone(String phone);
	public String getPhone();
	
	public void setRegdate(Date regdate);
	public Date getRegdate();
}