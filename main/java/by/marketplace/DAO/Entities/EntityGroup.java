package by.marketplace.DAO.Entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name = "entity_group")
public class EntityGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "entity_group_id")
	private int id;
	
	@Column(name = "entity_group_name")
	private String name;
	
	@OneToMany(targetEntity = GenericEntity.class, fetch = FetchType.EAGER)
	@JoinTable(name = "entity_group_to_entities", 
		joinColumns = @JoinColumn(name = "entity_group_id"), 
		inverseJoinColumns = @JoinColumn(name = "entity_id"))
	private Collection<GenericEntity> entities = new ArrayList<GenericEntity>();

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

	public Collection<GenericEntity> getEntities() {
		return entities;
	}

	public void setEntities(Collection<GenericEntity> entities) {
		this.entities = entities;
	}

}
