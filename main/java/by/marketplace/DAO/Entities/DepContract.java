package by.marketplace.DAO.Entities;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "dep_contract")
public class DepContract {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToOne
	@JoinColumn(name = "dep_id")
	private Depository depository;

	@OneToOne
	@JoinColumn(name = "service_plan_id")
	private DepServicePlan servicePlan;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Depository getDepository() {
		return depository;
	}

	public void setDepository(Depository depository) {
		this.depository = depository;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public DepServicePlan getServicePlan() {
		return servicePlan;
	}

	public void setServicePlan(DepServicePlan servicePlan) {
		this.servicePlan = servicePlan;
	}
	

}
