package by.marketplace.repository.vo;

import javax.persistence.*;

@Entity
@Table(name = "user")
@DiscriminatorValue("10")
public class UserVO extends GenericEntityVO {
	
	/** Hibernate bug not fixed by now (28.02.2016)
	 *  https://hibernate.atlassian.net/browse/ANN-140
	 *  
	 *  We have set discriminator values by ourselves inside initializer
	 */
	{
		try
		{
			EntityTypeVO et = new EntityTypeVO();
			et.setId(Discriminators.USER.getId());
			this.setEntityType(et);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Column(name = "city", length = 45)
	private String city;
	
	@Column(name = "phone", length = 45)
	private String phone;
	
	@Column(name = "email", length = 255)
	private String email;

	public void setCity(String city) {
		this.city = city;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
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

}
