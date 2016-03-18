package by.marketplace.repository.vo;

import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "account_transaction")
public class TransactionVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transaction_id")
	private int id;
	
	@OneToOne
	@JoinColumn(name = "source_acc_id")
	@NotNull
	private AccountVO sourceAccount;
	
	@OneToOne
	@JoinColumn(name = "dest_acc_id")
	@NotNull
	private AccountVO destAccount;

	@Temporal(TemporalType.TIMESTAMP)
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
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

	public AccountVO getSourceAccount() {
		return sourceAccount;
	}

	public void setSourceAccount(AccountVO sourceAccount) {
		this.sourceAccount = sourceAccount;
	}

	public AccountVO getDestAccount() {
		return destAccount;
	}

	public void setDestAccount(AccountVO destAccount) {
		this.destAccount = destAccount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
