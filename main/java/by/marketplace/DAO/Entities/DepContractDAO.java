package by.marketplace.DAO.Entities;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "dep_contract")
public class DepContractDAO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private UserDAO user;
	
	@OneToOne
	@JoinColumn(name = "dep_id")
	private DepositoryDAO depository;

	@OneToOne
	@JoinColumn(name = "service_plan_id")
	private DepServicePlanDAO servicePlan;
	
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

	public UserDAO getUser() {
		return user;
	}

	public void setUser(UserDAO user) {
		this.user = user;
	}

	public DepositoryDAO getDepository() {
		return depository;
	}

	public void setDepository(DepositoryDAO depository) {
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

	public DepServicePlanDAO getServicePlan() {
		return servicePlan;
	}

	public void setServicePlan(DepServicePlanDAO servicePlan) {
		this.servicePlan = servicePlan;
	}
	

}
