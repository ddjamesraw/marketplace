package by.marketplace.DAO.Entities;

import javax.persistence.*;

import org.hibernate.annotations.DiscriminatorOptions;

@Entity
@Table(name = "entity")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class GenericEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "entity_type_id")
	private EntityType entityType;

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
