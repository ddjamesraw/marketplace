package by.marketplace.DAO.entities;

import javax.persistence.*;

@Entity
@Table(name = "account_type")
public class AccountTypeDAO {

	@Id
	@Column(name = "acc_type_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "acc_type_descr", length=2000000)
	private String descr;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getDescr() {
		return descr;
	}

}
