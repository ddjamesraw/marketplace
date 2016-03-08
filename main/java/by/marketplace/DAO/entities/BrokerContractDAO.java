package by.marketplace.DAO.entities;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "broker_contract")
public class BrokerContractDAO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@OneToOne
	@JoinColumn(name = "broker_id")
	private BrokerDAO broker;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private UserDAO user;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	@OneToOne
	@JoinColumn(name = "service_plan_id")
	private BrokServicePlanDAO servicePlan;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BrokerDAO getBroker() {
		return broker;
	}

	public void setBroker(BrokerDAO broker) {
		this.broker = broker;
	}

	public UserDAO getUser() {
		return user;
	}

	public void setUser(UserDAO user) {
		this.user = user;
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

	public BrokServicePlanDAO getServicePlan() {
		return servicePlan;
	}

	public void setServicePlan(BrokServicePlanDAO servicePlan) {
		this.servicePlan = servicePlan;
	}

}
