package by.marketplace.DAO.entities;

import javax.persistence.*;

@Entity
@Table(name = "depository")
public class DepositoryDAO extends GenericEntityDAO{
	
	{
		EntityTypeDAO et = new EntityTypeDAO();
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
