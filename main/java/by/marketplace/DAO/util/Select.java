package by.marketplace.DAO.util;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.Criterion;

/**
 * 
 * @author A.Lagunov
 *
 */
public enum Select {
	Account(by.marketplace.DAO.entities.AccountDAO.class),
	AccountType(by.marketplace.DAO.entities.AccountTypeDAO.class),
	AccountSecurityGroup(by.marketplace.DAO.entities.AccountSecurityGroupDAO.class),
	BondsIssue(by.marketplace.DAO.entities.BondsIssueDAO.class),
	Broker(by.marketplace.DAO.entities.BrokerDAO.class),
	BrokerContract(by.marketplace.DAO.entities.BrokerContractDAO.class),
	BrokerService(by.marketplace.DAO.entities.BrokerServiceDAO.class),
	BrokServicePlan(by.marketplace.DAO.entities.BrokServicePlanDAO.class),
	Depository(by.marketplace.DAO.entities.DepositoryDAO.class),
	DepContract(by.marketplace.DAO.entities.DepContractDAO.class),
	DepService(by.marketplace.DAO.entities.DepServiceDAO.class),
	DepServicePlan(by.marketplace.DAO.entities.DepServicePlanDAO.class),
	EntityType(by.marketplace.DAO.entities.EntityTypeDAO.class),
	EntityGroup(by.marketplace.DAO.entities.EntityGroupDAO.class),
	AssetType(by.marketplace.DAO.entities.AssetTypeDAO.class),
	Currency(by.marketplace.DAO.entities.CurrencyDAO.class),
	User(by.marketplace.DAO.entities.UserDAO.class),
	Passport(by.marketplace.DAO.entities.PassportDAO.class),
	SharesIssue(by.marketplace.DAO.entities.SharesIssueDAO.class),
	SecurityPolicy(by.marketplace.DAO.entities.SecurityPolicyDAO.class),
	Issuer(by.marketplace.DAO.entities.IssuerDAO.class),
	Transaction(by.marketplace.DAO.entities.TransactionDAO.class),
	MarketPrice(by.marketplace.DAO.entities.MarketPriceDAO.class),
	OrderType(by.marketplace.DAO.entities.OrderTypeDAO.class),
	Order(by.marketplace.DAO.entities.OrderDAO.class),
	PricingType(by.marketplace.DAO.entities.PricingTypeDAO.class);

	private Class<?> correspondingClass;
	
	private Serializable id;
	
	private Select(Class<?> c) {
		this.setCorrespondingClass(c);
	}
	
	public Select byId(int id) {
		this.id = new Integer(id);
		return this;
	}
	
	public Select byId(String id) {
		this.id = (String) id;
		return this;
	}
	
	public Serializable getId() {
		return this.id;
	}

	public Class<?> getCorrespondingClass() {
		return correspondingClass;
	}

	private void setCorrespondingClass(Class<?> c) {
		this.correspondingClass = c;
	}
	
}