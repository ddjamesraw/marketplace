package by.marketplace.repository.vo;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "entity")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class GenericEntityVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true)
	private int id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "entity_type_id")
	@NotNull
	private EntityTypeVO entityType;
	
	@Temporal(TemporalType.TIMESTAMP)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Date regdate;

	public void setRegDate(Date regDate) {
		this.regdate = regDate;
	}

	public Date getRegDate() {
		return regdate;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public EntityTypeVO getEntityType() {
		return entityType;
	}

	public void setEntityType(EntityTypeVO entityType) {
		this.entityType = entityType;
	}
}
