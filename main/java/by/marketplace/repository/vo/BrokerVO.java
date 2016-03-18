package by.marketplace.repository.vo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "broker")
public class BrokerVO extends GenericEntityVO {
	
	{
		try
		{
			EntityTypeVO et = new EntityTypeVO();
			et.setId(Discriminators.BROKER.getId());
			this.setEntityType(et);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Column(name = "name")
	@NotNull
	private String name;
	
	@Column(name = "unp")
	@NotNull
	private String unp;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnp() {
		return unp;
	}

	public void setUnp(String unp) {
		this.unp = unp;
	}
}
