package by.marketplace.DAO.entities;

import javax.persistence.*;

@Entity
@Table(name = "order_type")
public class OrderTypeDAO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "z_type_id")
	private int id;
	
	@Column(name = "z_type_name")
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
