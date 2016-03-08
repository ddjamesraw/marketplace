package by.marketplace.DAO.entities;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "entity_type")
public class EntityTypeDAO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "entity_type_id")
	private int id;
	
	@Column(name = "entity_type_name")
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
/**
 * Warning! do not use ordinal() method as 
 * it produces wrong IDs
 * 
 * @author A.Lagunov
 *
 */
enum EntityTypeEnum {
	User(1), Issuer(2);
	
	private EntityTypeEnum(int id) {
		this.id = id;
	}
	
	private int id;
	
	public int getId() {
		return id;
	}
}