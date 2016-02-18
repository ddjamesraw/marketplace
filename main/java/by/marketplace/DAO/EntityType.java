package by.marketplace.DAO;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "entity_type")
public class EntityType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false, name = "entity_type_id")
	private int id;
	
	@Column(name = "entity_type_name", length = 45)
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
