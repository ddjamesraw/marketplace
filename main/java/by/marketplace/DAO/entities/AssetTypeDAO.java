package by.marketplace.DAO.entities;

import javax.persistence.*;

@Entity
@Table(name = "asset_type")
public class AssetTypeDAO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "asset_type_id")
	private int id;
	
	@Column(name = "asset_name", length = 45)
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
