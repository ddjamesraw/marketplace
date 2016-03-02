package by.marketplace.DAO.Entities;

import javax.persistence.*;

@Entity
@Table(name = "depository")
public class Depository extends GenericEntity{
	
	{
		EntityType et = new EntityType();
		et.setId(11);
		this.setEntityType(et);
	}
	
	@Column(name = "dep_name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
