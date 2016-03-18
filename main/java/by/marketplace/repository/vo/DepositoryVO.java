package by.marketplace.repository.vo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "depository")
public class DepositoryVO extends GenericEntityVO{
	
	{
		try
		{
			EntityTypeVO et = new EntityTypeVO();
			et.setId(11);
			this.setEntityType(et);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@Column(name = "dep_name")
	@NotNull
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
