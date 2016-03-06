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
	Account(by.marketplace.DAO.Entities.AccountDAO.class),
	AccountType(by.marketplace.DAO.Entities.AccountTypeDAO.class),
	AccountSecurityGroup(by.marketplace.DAO.Entities.AccountSecurityGroupDAO.class),
	BondsIssue(by.marketplace.DAO.Entities.BondsIssueDAO.class),
	Broker(by.marketplace.DAO.Entities.BrokerDAO.class),
	BrokerContract(by.marketplace.DAO.Entities.BrokerContractDAO.class),
	BrokerService(by.marketplace.DAO.Entities.BrokerServiceDAO.class),
	BrokServicePlan(by.marketplace.DAO.Entities.BrokServicePlanDAO.class),
	Depository(by.marketplace.DAO.Entities.DepositoryDAO.class),
	DepContract(by.marketplace.DAO.Entities.DepContractDAO.class),
	DepService(by.marketplace.DAO.Entities.DepServiceDAO.class),
	DepServicePlan(by.marketplace.DAO.Entities.DepServicePlanDAO.class),
	EntityType(by.marketplace.DAO.Entities.EntityTypeDAO.class),
	EntityGroup(by.marketplace.DAO.Entities.EntityGroupDAO.class),
	AssetType(by.marketplace.DAO.Entities.AssetTypeDAO.class),
	Currency(by.marketplace.DAO.Entities.CurrencyDAO.class),
	User(by.marketplace.DAO.Entities.UserDAO.class),
	Passport(by.marketplace.DAO.Entities.PassportDAO.class),
	SharesIssue(by.marketplace.DAO.Entities.SharesIssueDAO.class),
	SecurityPolicy(by.marketplace.DAO.Entities.SecurityPolicyDAO.class),
	Issuer(by.marketplace.DAO.Entities.IssuerDAO.class),
	Transaction(by.marketplace.DAO.Entities.TransactionDAO.class),
	MarketPrice(by.marketplace.DAO.Entities.MarketPriceDAO.class),
	OrderType(by.marketplace.DAO.Entities.OrderTypeDAO.class),
	Order(by.marketplace.DAO.Entities.OrderDAO.class),
	PricingType(by.marketplace.DAO.Entities.PricingTypeDAO.class);

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