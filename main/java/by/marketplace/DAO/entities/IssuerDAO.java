package by.marketplace.DAO.entities;

import javax.persistence.*;

@Entity
@Table(name = "issuer")
public class IssuerDAO extends GenericEntityDAO {
	
	{
		EntityTypeDAO et = new EntityTypeDAO();
		et.setId(12);
		this.setEntityType(et);
	}
	
	@Column(name = "issuer_unp")
	private String unp;
	
	@Column(name = "issuer_short_name", length = 45)
	private String shortName;
	
	@Column(name = "issuer_full_name", length = 255)
	private String fullName;

	public String getUnp() {
		return unp;
	}

	public void setUnp(String unp) {
		this.unp = unp;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
