package by.marketplace.logic;

import java.util.Date;


import by.marketplace.repository.vo.UserVO;

public class UserImpl implements User {
	
	@Override
	public void constructFromVO(Object object) {
		UserVO userVO = UserVO.class.cast(object);
		this.id = userVO.getId();
		this.city = userVO.getCity();
		this.phone = userVO.getPhone();
		this.email = userVO.getEmail();
		this.regdate = userVO.getRegDate();
	}

	@Override
	public UserVO getVO() {
		UserVO result = new UserVO();
		result.setCity(city);
		result.setPhone(phone);
		result.setEmail(email);
		result.setRegDate(regdate);
		return result;
	}
	
	@Override
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String getCity() {
		return city;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String getPhone() {
		return phone;
	}

	@Override
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public Date getRegdate() {
		return regdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int id;
	
	private String city;
	
	private String phone;
	
	private String email;
	
	private Date regdate;
}
