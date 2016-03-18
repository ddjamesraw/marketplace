package by.marketplace.repository.vo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "asset_type")
public class AssetTypeVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "asset_type_id")
	private int id;
	
	@Column(name = "asset_name", length = 45)
	@NotNull
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
