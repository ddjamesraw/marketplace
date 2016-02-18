package by.marketplace.DAO;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "entity")
public class GenericEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false, name = "entity_id")
	private int id;
	
	@ManyToOne
	@JoinColumn(nullable = false, name = "entity_type_id")
	private EntityType entityType = new EntityType();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public EntityType getEntityType() {
		return entityType;
	}

	public void setEntityType(EntityType entityType) {
		this.entityType = entityType;
	}
}
