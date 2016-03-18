package by.marketplace.repository.vo;

import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "broker_contract")
public class BrokerContractVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@OneToOne
	@JoinColumn(name = "broker_id")
	@NotNull
	private BrokerVO broker;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	@NotNull
	private UserVO user;
	
	@Column(name = "start_date")
	@NotNull
	private Date startDate;
	
	@Column(name = "end_date")
	@NotNull
	private Date endDate;
	
	@OneToOne
	@JoinColumn(name = "service_plan_id")
	private BrokServicePlanVO servicePlan;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BrokerVO getBroker() {
		return broker;
	}

	public void setBroker(BrokerVO broker) {
		this.broker = broker;
	}

	public UserVO getUser() {
		return user;
	}

	public void setUser(UserVO user) {
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

	public BrokServicePlanVO getServicePlan() {
		return servicePlan;
	}

	public void setServicePlan(BrokServicePlanVO servicePlan) {
		this.servicePlan = servicePlan;
	}

}
