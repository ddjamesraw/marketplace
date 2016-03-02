package by.marketplace.DAO.Entities;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "broker_contract")
public class BrokerContract {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@OneToOne
	@JoinColumn(name = "broker_id")
	private Broker broker;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	@OneToOne
	@JoinColumn(name = "service_plan_id")
	private BrokServicePlan servicePlan;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Broker getBroker() {
		return broker;
	}

	public void setBroker(Broker broker) {
		this.broker = broker;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
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

	public BrokServicePlan getServicePlan() {
		return servicePlan;
	}

	public void setServicePlan(BrokServicePlan servicePlan) {
		this.servicePlan = servicePlan;
	}

}
