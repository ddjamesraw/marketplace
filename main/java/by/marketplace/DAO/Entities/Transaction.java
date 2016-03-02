package by.marketplace.DAO.Entities;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "account_transaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transaction_id")
	private int id;
	
	@OneToOne
	@JoinColumn(name = "source_acc_id")
	private Account sourceAccount;
	
	@OneToOne
	@JoinColumn(name = "dest_acc_id")
	private Account destAccount;

	@Temporal(TemporalType.TIMESTAMP)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Date timestamp;
	
	@Column(name = "description")
	private String description;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}

	public int getId() {
		return id;
	}

	public Account getSourceAccount() {
		return sourceAccount;
	}

	public void setSourceAccount(Account sourceAccount) {
		this.sourceAccount = sourceAccount;
	}

	public Account getDestAccount() {
		return destAccount;
	}

	public void setDestAccount(Account destAccount) {
		this.destAccount = destAccount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
