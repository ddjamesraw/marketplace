package by.marketplace.repository.vo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "entity_group")
public class EntityGroupVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "entity_group_id")
	private int id;
	
	@Column(name = "entity_group_name")
	@NotNull
	private String name;
	
	@OneToMany(targetEntity = GenericEntityVO.class, fetch = FetchType.EAGER)
	@JoinTable(name = "entity_group_to_entities", 
		joinColumns = @JoinColumn(name = "entity_group_id"), 
		inverseJoinColumns = @JoinColumn(name = "entity_id"))
	private Collection<GenericEntityVO> entities = new ArrayList<GenericEntityVO>();

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

	public Collection<GenericEntityVO> getEntities() {
		return entities;
	}

	public void setEntities(Collection<GenericEntityVO> entities) {
		this.entities = entities;
	}

}
