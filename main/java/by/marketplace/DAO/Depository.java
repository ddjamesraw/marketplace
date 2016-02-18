package by.marketplace.DAO;

import javax.persistence.*;

@Entity
@Table(name = "depository")
public class Depository {

	@Id
	@Column(name = "dep_id")
	private int id;
	
	@Column(name = "dep_name", length = 45)
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
