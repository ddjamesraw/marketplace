package by.marketplace.repository.vo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "issuer")
public class IssuerVO extends GenericEntityVO {
	
	{
		try
		{
			EntityTypeVO et = new EntityTypeVO();
			et.setId(12);
			this.setEntityType(et);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Column(name = "issuer_unp")
	@NotNull
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
