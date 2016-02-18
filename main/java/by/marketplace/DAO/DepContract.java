package by.marketplace.DAO;

import javax.persistence.*;

@Entity
@Table(name = "dep_contract")
public class DepContract {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne()
	private Entity sideA;
	
	private Entity sideB;
	
	private int serviceId;
	
	

}
