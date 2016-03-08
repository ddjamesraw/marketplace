package by.marketplace.DAO.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name = "entity_group")
public class EntityGroupDAO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "entity_group_id")
	private int id;
	
	@Column(name = "entity_group_name")
	private String name;
	
	@OneToMany(targetEntity = GenericEntityDAO.class, fetch = FetchType.EAGER)
	@JoinTable(name = "entity_group_to_entities", 
		joinColumns = @JoinColumn(name = "entity_group_id"), 
		inverseJoinColumns = @JoinColumn(name = "entity_id"))
	private Collection<GenericEntityDAO> entities = new ArrayList<GenericEntityDAO>();

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

	public Collection<GenericEntityDAO> getEntities() {
		return entities;
	}

	public void setEntities(Collection<GenericEntityDAO> entities) {
		this.entities = entities;
	}

}
