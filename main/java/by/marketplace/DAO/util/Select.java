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
	Account(by.marketplace.DAO.Entities.Account.class),
	AccountType(by.marketplace.DAO.Entities.AccountType.class),
	AccountSecurityGroup(by.marketplace.DAO.Entities.AccountSecurityGroup.class),
	BondsIssue(by.marketplace.DAO.Entities.BondsIssue.class),
	Broker(by.marketplace.DAO.Entities.Broker.class),
	BrokerContract(by.marketplace.DAO.Entities.BrokerContract.class),
	BrokerService(by.marketplace.DAO.Entities.BrokerService.class),
	BrokServicePlan(by.marketplace.DAO.Entities.BrokServicePlan.class),
	Depository(by.marketplace.DAO.Entities.Depository.class),
	DepContract(by.marketplace.DAO.Entities.DepContract.class),
	DepService(by.marketplace.DAO.Entities.DepService.class),
	DepServicePlan(by.marketplace.DAO.Entities.DepServicePlan.class),
	EntityType(by.marketplace.DAO.Entities.EntityType.class),
	EntityGroup(by.marketplace.DAO.Entities.EntityGroup.class),
	AssetType(by.marketplace.DAO.Entities.AssetType.class),
	Currency(by.marketplace.DAO.Entities.Currency.class),
	User(by.marketplace.DAO.Entities.User.class),
	Passport(by.marketplace.DAO.Entities.Passport.class),
	SharesIssue(by.marketplace.DAO.Entities.SharesIssue.class),
	SecurityPolicy(by.marketplace.DAO.Entities.SecurityPolicy.class),
	Issuer(by.marketplace.DAO.Entities.Issuer.class),
	Transaction(by.marketplace.DAO.Entities.Transaction.class),
	MarketPrice(by.marketplace.DAO.Entities.MarketPrice.class),
	OrderType(by.marketplace.DAO.Entities.OrderType.class),
	Order(by.marketplace.DAO.Entities.Order.class),
	PricingType(by.marketplace.DAO.Entities.PricingType.class);

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