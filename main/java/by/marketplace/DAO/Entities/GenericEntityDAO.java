package by.marketplace.DAO.Entities;

import javax.persistence.*;

import org.hibernate.annotations.DiscriminatorOptions;

@Entity
@Table(name = "entity")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class GenericEntityDAO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "entity_type_id")
	private EntityTypeDAO entityType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public EntityTypeDAO getEntityType() {
		return entityType;
	}

	public void setEntityType(EntityTypeDAO entityType) {
		this.entityType = entityType;
	}
}
