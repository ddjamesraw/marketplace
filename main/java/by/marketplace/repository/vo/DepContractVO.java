package by.marketplace.repository.vo;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "dep_contract")
public class DepContractVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	@NotNull
	private UserVO user;
	
	@OneToOne
	@JoinColumn(name = "dep_id")
	@NotNull
	private DepositoryVO depository;

	@OneToOne
	@JoinColumn(name = "service_plan_id")
	@NotNull
	private DepServicePlanVO servicePlan;
	
	@Column(name = "start_date")
	@NotNull
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserVO getUser() {
		return user;
	}

	public void setUser(UserVO user) {
		this.user = user;
	}

	public DepositoryVO getDepository() {
		return depository;
	}

	public void setDepository(DepositoryVO depository) {
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

	public DepServicePlanVO getServicePlan() {
		return servicePlan;
	}

	public void setServicePlan(DepServicePlanVO servicePlan) {
		this.servicePlan = servicePlan;
	}
	

}
