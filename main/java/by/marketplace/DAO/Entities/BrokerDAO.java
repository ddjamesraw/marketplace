package by.marketplace.DAO.Entities;

import javax.persistence.*;

@Entity
@Table(name = "broker")
public class BrokerDAO extends GenericEntityDAO {
	
	{
		EntityTypeDAO et = new EntityTypeDAO();
		et.setId(13);
		this.setEntityType(et);
	}
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "unp")
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
