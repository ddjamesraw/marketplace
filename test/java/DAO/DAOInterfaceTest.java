package DAO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import by.marketplace.config.ApplicationConfiguration;
import by.marketplace.repository.Manager;
import by.marketplace.repository.vo.*;


public class DAOInterfaceTest {
//	
////	public static final Logger log = LogManager.getLogger();
//	
//	public static final ApplicationContext appContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class); 
//	
//	public static final Manager manager = (Manager) appContext.getBean("manager");
//	
//	@Test
//	public void saveEntityTypeTest() {
//		 
//		
//		EntityTypeDAO et = new EntityTypeDAO();
//		et.setName("Пользователь");
//		
//		Serializable generatedId = -1;
//		
//		generatedId = manager.save(et);
//		
//		Assert.assertTrue((int)generatedId>0);
//		
//		et = new EntityTypeDAO();
//		et.setName("Депозитарий");
//		
//		generatedId = manager.save(et);
//		
//		Assert.assertTrue((int)generatedId>0);
//		System.out.println("Saved two EntityTypes");
//	}
//	
//	@Test
//	public void getEntityTypeTest() {
//		 
//		
//		int etId = 10;
//		
//		EntityTypeDAO et = null;
//		et = (EntityTypeDAO) manager.get(Select.EntityType.byId(etId));
//		
//		Assert.assertNotNull(et);
//		System.out.println("Retrieve EntityType by id: "+etId+" name: "+et.getName());
//	}
//	
//	@Test
//	public void saveUserTest() {
//		 
//		
//		UserDAO u = new UserDAO();
//		u.setEmail("user@usemail.jp"+Math.random()*999);
//		u.setPhone("+375291950019"+Math.random()*999);
//		u.setCity("Речица");
//		u.setRegDate(new Date(System.currentTimeMillis()));
//		
//		Serializable generatedId = -1;
//		generatedId = manager.save(u);
//		
//		Assert.assertTrue("id is not negative", (int)generatedId>0);
//		System.out.println(String.format("Save 'User' with generated id=%d", generatedId));
//	}
//	
//	@Test
//	public void getUserbyIdTest() {
//		 
//		int userId = 122;
//		
//		UserDAO u = (UserDAO) manager.get(Select.User.byId(userId));
//		
//		Assert.assertNotNull(u);
//		System.out.println(String.format("Retrieve User by id=%d, email: %s", u.getId(), u.getEmail()));
//	}
//	
////	@Test
//	public void savePassportForUserIdTest() {
//		 
//		
//		int userId = 122;
//		PassportDAO p = new PassportDAO();
//		
//		Calendar cal = Calendar.getInstance();
//		cal.set(Calendar.YEAR, 1980);
//		p.setDOB(cal.getTime());
//		p.setFname("Кирилл");
//		p.setLname("Леной");
//		p.setSname("Викторович");
//		p.setPassportIssuer("Речицкий РОВД Гомельской области");
//		cal.set(Calendar.YEAR, 1995);
//		p.setPassportRegDate(cal.getTime());
//		p.setPassportSN("HB"+Math.random()*10000);
//		p.setPersonalID("RANDOM"+Math.random()*10000);
//		p.setUser(  (UserDAO) manager.get(   Select.User.byId(userId)   )  );
//		
//		Serializable generatedId = -1;
//		generatedId = manager.save(p);
//		
//		Assert.assertTrue("Saved passport's id is > 0",(int)generatedId>0);
//		System.out.println(String.format("Save passport with generated id: %s for User with id: %d", generatedId, userId));
//	}
//	
//	@Test
//	public void saveIssuerTest() {
//		 
//		
//		IssuerDAO issuer = new IssuerDAO();
//		issuer.setFullName("Открытое акционерное общество \"Беларуськалий\"");
//		issuer.setShortName("ОАО \"Беларуськалий\"");
//		issuer.setUnp(String.valueOf(Math.random()*10).substring(0, 10));
//		
//		Serializable generatedId = manager.save(issuer);
//		
//		Assert.assertTrue("ID generated for new Issuer >0", (int)generatedId>0);
//		System.out.println(String.format("Save issuer with unp: %s, generated ID: %d, "
//				+ "name: %s", issuer.getUnp(), generatedId, issuer.getShortName()));
//	}
//	
//	@Test
//	public void getIssuerTest() {
//		 
//		
//		int issuerId = 123;
//		IssuerDAO issuer = (IssuerDAO) manager.get(Select.Issuer.byId(issuerId));
//		
//		Assert.assertNotNull("Retrieved issuer is not null", issuer!=null);
//		System.out.println(String.format("Retrieve Issuer by id: %d, name: %s", issuerId, issuer.getShortName()));
//	}
//	
//	@Test
//	public void saveAssetTypeTest() {
//		 
//		
//		AssetTypeDAO at = new AssetTypeDAO();
//		at.setName("Акции");
//		
//		Serializable generatedId = manager.save(at);
//		
//		Assert.assertTrue("Generated id for AssetType is not negative", (int)generatedId>0);
//		System.out.println(String.format("Save AssetType with id: %d, name: %s", generatedId, at.getName()));
//	}
//	
//	@Test
//	public void getAssetTypeTest() {
//		 
//
//		int assetTypeId = 75;
//		
//		AssetTypeDAO at = (AssetTypeDAO) manager.get(Select.AssetType.byId(assetTypeId));
//		
//		Assert.assertNotNull("Retrieved AssetType is not null", at!=null);
//		System.out.println(String.format("Retrieve AssetType by id: %d, name: ", assetTypeId, at.getName()));
//	}
//	
//	@Test
//	public void saveCurrencyTest() {
//		 
//		
//		Serializable generatedId = -1;
//		
//		CurrencyDAO c = new CurrencyDAO();
//		AssetTypeDAO at = (AssetTypeDAO) manager.get(Select.AssetType.byId(76));
//		c.setAssetType(at);
//		c.setIssuer((IssuerDAO)manager.get(Select.Issuer.byId(123)));
//		c.setName("Белорусский рубль");
//		c.setShortName("BYR");
//		c.setSymbol('?');
//		
//		generatedId = manager.save(c);
//		
//		Assert.assertTrue("Generated id for currency is >0", (int)generatedId>0);
//		System.out.println(String.format("Save currency with id: %d name: %s, issuer: %s", 
//				generatedId, c.getName(), c.getIssuer()));
//	}
//	
//	@Test
//	public void getCurrencyByIdTest() {
//
//		 
//
//		int currencyId = 157;
//		
//		CurrencyDAO c = (CurrencyDAO) manager.get(Select.Currency.byId(currencyId));
//		
//		Assert.assertNotNull("Retrieved Currency is not null", c!=null);
//		System.out.println(String.format("Retrieve Currency by id: %d, name: %s", currencyId, c.getName()));
//	}
//	
//	@Test
//	public void saveSharesIssueTest() {
//		 
//		
//		SharesIssueDAO si = new SharesIssueDAO();
//		si.setAssetType((AssetTypeDAO) manager.get(Select.AssetType.byId(75)));
//		si.setBatch("АБК");
//		si.setCode("BY64301A6896");
//		si.setCurrency((CurrencyDAO) manager.get(Select.Currency.byId(157)));
//		Calendar cal = Calendar.getInstance();
//		cal.set(2012, 3, 19, 0, 0, 0);
//		si.setFollowOnDate(cal.getTime());
//		si.setIssuer((IssuerDAO) manager.get(Select.Issuer.byId(123)));
//		si.setNominalValue(7990668);
//		si.setNumber(1);
//		si.setPartialAnnulation(false);
//		si.setPrivileged(false);
//		si.setQuantity(1717876);
//		cal.set(2010, 9, 26, 0, 0, 0);
//		si.setRegDate(cal.getTime());
//		si.setRegNumber("6-430-01-14436");
//		cal.set(2012, 3, 19, 0, 0, 0);
//		si.setStoreDate(cal.getTime());
//		si.setTicker("БеларусьКалий А1");
//		si.setVolume(13726976781168L);
//		
//		Serializable generatedId = manager.save(si);
//		
//		Assert.assertTrue("Generated id for SharesIssue > 0", (int)generatedId>0);
//		System.out.println(String.format("Save SharesIssue, generated id: %d, ticker: %s", generatedId, si.getTicker()));
//	}
//	
//	@Test
//	public void getSharesIssueByIdTest() {
//
//		 
//
//		int sharesIssueId = 160;
//		
//		SharesIssueDAO si = (SharesIssueDAO) manager.get(Select.SharesIssue.byId(sharesIssueId));
//		
//		Assert.assertNotNull("Retrieved SharesIssue is not null", si!=null);
//		System.out.println(String.format("Retrieve SharesIssue by id: %d, ticker: %s", sharesIssueId, si.getTicker()));
//		
//	}
//	
//	@Test
//	public void saveAccountTypeTest() {
//		 
//		
//		AccountTypeDAO at = new AccountTypeDAO();
//		at.setDescr("User's personal wallet");
//		
//		Serializable generatedId = manager.save(at);
//		
//		Assert.assertTrue("Generated id for the new account type > 0", (int)generatedId>0);
//		System.out.println(String.format("Save AccountType: '%s', generated id: %d", at.getDescr(), generatedId));
//	}
//	
//	@Test
//	public void saveAccountTest() {
//		 
//		Serializable generatedId = -1;
//		
//		AccountDAO account = new AccountDAO();
//		int userId = 122;
//		int accountTypeId = 59;
//
//		GenericEntityDAO holder = (GenericEntityDAO) manager.get(Select.User.byId(userId));
//		GenericEntityDAO owner = holder;
//		AccountTypeDAO at = (AccountTypeDAO) manager.get(Select.AccountType.byId(accountTypeId));
//		
//		account.setAccountType(at);
//		account.setHolder(holder);
//		account.setOwner(owner);
//		
//		generatedId = manager.save(account);
//		
//		Assert.assertTrue("Id generated for a new Account is > 0", (int)generatedId>0);
//		System.out.println(String.format("Save Account with generated id: %d, holder's id: %s, owner's id: %s", 
//				generatedId, holder.getId(), owner.getId()));
//	}
//	
//	@Test
//	public void getAccountTest() {
//		 
//		
//		AccountDAO acc = null;
//		int accountId = 74;
//		
//		acc = (AccountDAO) manager.get(Select.Account.byId(accountId));
//		
//		Assert.assertTrue("Retrieved Account is not null", acc!=null);
//		System.out.println(String.format("Retrieve account by id: %d, holder: %d", accountId, acc.getHolder().getId()));
//	}
//	
//	@Test
//	public void saveBondsIssueTest() {
//		 
//		
//		BondsIssueDAO bi = new BondsIssueDAO();
//		bi.setAssetType((AssetTypeDAO) manager.get(Select.AssetType.byId(77)));
////		bi.setBatch("???");
//		bi.setCode("BY50002B0907");
//		bi.setCurrency((CurrencyDAO) manager.get(Select.Currency.byId(157)));
//		bi.setInterestRate(15);
//		Calendar cal = Calendar.getInstance();
//		cal.set(2016, 9, 7);
//		bi.setIssueMaturityDate(cal.getTime());
//		bi.setIssuer((IssuerDAO)manager.get(Select.Issuer.byId(123)));
//		bi.setLifeCycle(-1);
//		bi.setNominalValue(1000000);
//		bi.setNumber(5);
//		bi.setQuantity(75);
//		cal.set(2014, 9, 3);
//		bi.setRegDate(cal.getTime());
//		bi.setRegnumber("5-200-02-2311");
//		bi.setStoreDate(null);
//		bi.setTicker("Амкодор Оп5");
//		bi.setVolume(75000000);
//		
//		Serializable generatedId = -1;
//		generatedId = (int) manager.save(bi);
//		
//		Assert.assertTrue("Generated Id for BondsIssue is > 0", (int)generatedId>0);
//		System.out.println(String.format("Save BondsIssue with generated id: %d, "
//				+ "ticker: %s", generatedId, bi.getTicker()));
//	}
//	
//	@Test
//	public void getBondsIssueTest() {
//		 
//		
//		BondsIssueDAO bi = null;
//		int bondsIssueId = 164;
//		
//		bi = (BondsIssueDAO) manager.get(Select.BondsIssue.byId(bondsIssueId));
//		
//		Assert.assertTrue("Retrieved BondsIssue is not null", bi!=null);
//		System.out.println(String.format("Retrieve BondsIssue by id: %d, "
//				+ "ticker: %s", bondsIssueId, bi.getTicker()));
//	}
//	
//	@Test
//	public void saveEntityGroupTest() {
//		 
//		
//		EntityGroupDAO eg = new EntityGroupDAO();
//		eg.setName("Группа 2");
//		eg.getEntities().add((GenericEntityDAO) manager.get(Select.User.byId(3)));
//		
//		Serializable generatedId = -1;
//		try{
//			generatedId = (int) manager.save(eg);			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		Assert.assertTrue("Saved EntityGroup id is > 0", (int) generatedId > 0);
//		System.out.println("Save EntityGroup with generated id: " + generatedId);
//	}
//	
//	@Test
//	public void updateEntityGroupTest() {
//		 
//
//		int userOneId = 122;
//		int userTwoId = 124;
//		GenericEntityDAO u = (GenericEntityDAO) manager.get(Select.User.byId(userOneId));
//		GenericEntityDAO u2 = (GenericEntityDAO) manager.get(Select.User.byId(userTwoId));
//		
//		int egId = 36;
//		EntityGroupDAO eg = (EntityGroupDAO) manager.get(Select.EntityGroup.byId(egId));
//
//		eg.getEntities().add(u);
//		eg.getEntities().add(u2);
//		
//		try {
//			manager.saveOrUpdate(eg);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		eg = null;
//		
//		eg = (EntityGroupDAO) manager.get(Select.EntityGroup.byId(egId));
//		
//		System.out.println(String.format("Update EntityGroup(id: %d), "
//				+ "add User(id: %d)", eg.getId(), u2.getId()));
//		
//	}
//
//	@Test
//	public void getEntityGroupTest() {
//		 
//		
//		EntityGroupDAO eg = null;
//		int egId = 36;
//		
//		eg = (EntityGroupDAO) manager.get(Select.EntityGroup.byId(egId));
//		
//		Assert.assertTrue("Retrieved EntityGroup is not null", eg!=null);
//		System.out.println(String.format("Retrieve EntityGroup by id: %d, name: %s, entities: %s", 
//				egId, eg.getName(), eg.getEntities().toString()));
//	}
//	
//	@Test
//	public void saveSecurityPolicyTest() {
//		 
//		
//		SecurityPolicyDAO sp = new SecurityPolicyDAO();
//		sp.setPeekAllowed(true);
//		sp.setName("Только просмотр");
//		
//		Serializable generatedId = -1;
//		generatedId = manager.save(sp);
//		
//		Assert.assertTrue("Generated Id for saved SecurityPolicy is > 0", (int)generatedId>0);
//		System.out.println(String.format("Save new SecurityPolicy with generated id: %d, name: %s", generatedId, sp.getName()));
//	}
//	
//	@Test
//	public void getSecurityPolicyTest() {
//		 
//		
//		SecurityPolicyDAO sp = null;
//		int spId = 28;
//		
//		sp = (SecurityPolicyDAO) manager.get(Select.SecurityPolicy.byId(spId));
//		
//		Assert.assertTrue("Retrieved SecurityPolicy is not null", sp!=null);
//		System.out.println(String.format("Retrieve SecurityPolicy by id: %d, name: %s",spId, sp.getName()));
//	}
//	
//	@Test
//	public void saveAccountSecurityGroupTest() {
//		 
//		
//		AccountSecurityGroupDAO sg = new AccountSecurityGroupDAO();
//		int spId = 28;
//		int egId = 36;
//		
//		sg.setName("Группа безопасности");
//		sg.setSecurityPolicy((SecurityPolicyDAO) manager.get(Select.SecurityPolicy.byId(spId)));
//		sg.setEntityGroup((EntityGroupDAO) manager.get(Select.EntityGroup.byId(egId)));
//
//		Serializable generatedId = -1;
//		generatedId = manager.save(sg);
//		
//		Assert.assertTrue("Saved SecurityGroup with generated id > 0", (int) generatedId > 0);
//		System.out.println(String.format("Save SecurityGroup with name: %s, generated id: %d", sg.getName(), generatedId));
//	}
//	
//	@Test
//	public void getAccountSecurityGoupTest() {
//		 
//		
//		int asgId = 25;
//
//		AccountSecurityGroupDAO asg = null;
//		asg = (AccountSecurityGroupDAO) manager.get(Select.AccountSecurityGroup.byId(asgId));
//		
//		Assert.assertTrue("Retrieved AccountSecurityGroup is not null", asg!=null);
//		System.out.println(String.format("Retrieve AccountSecurityGroup "
//				+ "by id: %d, name: %s", asgId, asg.getName()));
//	}
//
//	@Test
//	public void saveTransactionTest() {
//		 
//		
//		int sourceAccId = 74;
//		int destAccId = 75;
//		
//		AccountDAO sourceAcc = (AccountDAO) manager.get(Select.Account.byId(sourceAccId));
//		AccountDAO destAcc = (AccountDAO) manager.get(Select.Account.byId(destAccId));
//		
//		Assert.assertNotNull(sourceAcc);
//		Assert.assertNotNull(destAcc);
//		
//		TransactionDAO t = new TransactionDAO();
//		t.setSourceAccount(sourceAcc);
//		t.setDestAccount(destAcc);
//		t.setDescription("Тестовая транзакция");
//		
//		Serializable generatedId = -1;
//		generatedId = manager.save(t);
//		
//		Assert.assertTrue((int)generatedId>0);
//		
//		System.out.println(String.format("Insert new transaction, generated id: %d", generatedId));
//	}
//	
//	@Test
//	public void getTransactionTest() {
//		 
//		
//		int transactionId = 10;
//		
//		TransactionDAO t = null;
//		
//		t = (TransactionDAO) manager.get(Select.Transaction.byId(transactionId));
//		
//		Assert.assertNotNull(t);
//		
//		System.out.println("Retrieve transaction with id: "+t.getId());
//	}
//	
//	/*
//	 * Be aware that return type for DAOInterface.save(MarketPrice) is marketprice itself
//	 */
//	@Test
//	public void saveMarketPrice() {
//		 
//		
//		int sharesIssueId = 160;
//		int currencyId = 157;		
//		
//		SharesIssueDAO si = (SharesIssueDAO) manager.get(Select.SharesIssue.byId(sharesIssueId));
//		CurrencyDAO c = (CurrencyDAO) manager.get(Select.Currency.byId(currencyId));
//		
//		MarketPriceDAO mp = new MarketPriceDAO();
//		mp.setAsset(si);
//		mp.setCurrency(c);
//		mp.setPrice(Double.MAX_VALUE);
//		Calendar cal = Calendar.getInstance();
//		cal.set(1992,11,14);
//		mp.setTimestamp(cal.getTime());
//		
//		Serializable generatedId = -1;
//		
//		generatedId = manager.save(mp);
//		
//		Assert.assertNotNull(generatedId);	
//		System.out.println("Save MarketPrice, generated id: "+generatedId);
//	}
//	
//	@Test
//	public void getMarketPriceTest() {
//		 
//		
//		MarketPriceDAO mp = null;
//		mp = (MarketPriceDAO) manager.get(Select.MarketPrice.byId(160));
//		
//		Assert.assertNotNull(mp);
//		System.out.println("Retrieve Marketprice by asset with id: "+mp.getAsset().getId());
//	}
//	
//	@Test
//	public void saveDepositoryTest() {
//		 
//		
//		DepositoryDAO d = new DepositoryDAO();
//		d.setName("Тестовый депозитарий");
//		
//		Serializable generatedId = -1;
//		
//		generatedId = manager.save(d);
//		
//		Assert.assertTrue((int)generatedId>0);
//		System.out.println("Save new depository "+d.getName()+" generated id: "+generatedId);
//	}
//	
//	@Test
//	public void getDepositoryTest() {
//		 
//		
//		DepositoryDAO d = null;
//		d = (DepositoryDAO) manager.get(Select.Depository.byId(138));
//		
//		Assert.assertNotNull(d);
//		System.out.println("Retrieve depository by id: "+d.getId());
//	}
//	
//	@Test
//	public void saveDepContractTest() {
//		 
//		
//		DepContractDAO dp = new DepContractDAO();
//		dp.setDepository((DepositoryDAO) manager.get(Select.Depository.byId(138)));
//		dp.setUser((UserDAO) manager.get(Select.User.byId(122)));
//		Calendar cal = Calendar.getInstance();
//		cal.set(1992, 11, 14);
//		dp.setStartDate(cal.getTime());
//		cal.set(Calendar.YEAR, 1994);
//		dp.setEndDate(cal.getTime());
//		dp.setServicePlan((DepServicePlanDAO)manager.get(Select.DepServicePlan.byId(1)));
//		
//		int generatedId = -1;
//		generatedId = (int) manager.save(dp);
//		
//		Assert.assertTrue(generatedId>0);
//		System.out.println("Save DepContract, generated id: "+generatedId);
//	}
//	
//	@Test
//	public void getDepContractTest() {
//		 
//		
//		DepContractDAO dc = null;
//		
//		dc = (DepContractDAO) manager.get(Select.DepContract.byId(16));
//		
//		Assert.assertNotNull(dc);
//		System.out.println("Retrieve contract by id: "+dc.getId());
//	}
//	
//	@Test
//	public void saveBrokerTest() {
//		 
//		
//		BrokerDAO b = new BrokerDAO();
//		b.setName("Тестовый брокер");
//		b.setUnp(String.valueOf((int)Math.round(Math.random()*99999)));
//		
//		int generatedId = -1;
//		generatedId = (int) manager.save(b);
//		
//		Assert.assertTrue(generatedId>0);
//		System.out.println("Save Broker "+b.getName()+" generated id: "+generatedId);
//	}
//	
//	@Test
//	public void getBrokerTest() {
//		 
//		
//		BrokerDAO b = (BrokerDAO) manager.get(Select.Broker.byId(145));
//		
//		Assert.assertNotNull(b);
//	}
//	
//	@Test
//	public void saveBrokerContractTest() {
//		 
//		BrokerDAO b = (BrokerDAO) manager.get(Select.Broker.byId(145));
//		UserDAO u = (UserDAO) manager.get(Select.User.byId(122));
//		Date startDate = new Date(System.currentTimeMillis());
//		Date endDate = startDate;
//		
//		BrokerContractDAO bc = new BrokerContractDAO();
//		bc.setBroker(b);
//		bc.setStartDate(startDate);
//		bc.setEndDate(endDate);
//		bc.setUser(u);
//		bc.setServicePlan((BrokServicePlanDAO)manager.get(Select.BrokServicePlan.byId(1)));
//		
//		int id = (int) manager.save(bc);
//		
//		Assert.assertTrue(id>0);
//		
//		System.out.println("Save BrokerContract, id: "+id);
//	}
//	
//	@Test
//	public void getBrokerContractTest() {
//		BrokerContractDAO bc = null;
//		bc = (BrokerContractDAO) manager.get(Select.BrokerContract.byId(1));
//		Assert.assertNotNull(bc);
//	}
//	
//	@Test
//	public void saveOrderTypeTest() {
//		OrderTypeDAO ot = new OrderTypeDAO();
//		ot.setName("Покупка");
//		int id = -1;
//		id = (int)manager.save(ot);
//		Assert.assertTrue(id>0);
//	}
//	
//	@Test
//	public void getOrderTypeTest() {
//		Assert.assertNotNull(manager.get(Select.OrderType.byId(1)));
//	}
//	
//	@Test
//	public void saveOrderTest() {
//		OrderDAO o = new OrderDAO();
//		o.setAsset((SharesIssueDAO)manager.get(Select.SharesIssue.byId(160)));
//		o.setBroker((BrokerDAO)manager.get(Select.Broker.byId(145)));
//		o.setCurrency((CurrencyDAO)manager.get(Select.Currency.byId(157)));
//		o.setOrderType((OrderTypeDAO)manager.get(Select.OrderType.byId(1)));
//		o.setPricePerUnit(100000);
//		o.setQuantity(20);
//		o.setUser((UserDAO)manager.get(Select.User.byId(122)));
//		int id = -1;
//		id = (int)manager.save(o);
//		Assert.assertTrue(id>0);
//		System.out.println("Save order with id: "+id);
//	}
//	
//	@Test
//	public void getOrderTest() {
//		Assert.assertNotNull(manager.get(Select.Order.byId(1)));
//	}
//	
//	@Test
//	public void savePricingTypeTest() {
//		PricingTypeDAO pt = new PricingTypeDAO();
//		pt.setType("SUBSCRIPTION");
//		int id = -1;
//		id = (int) manager.save(pt);
//		Assert.assertTrue(id>0);
//	}
//	
//	@Test
//	public void getPricingTypeTest() {
//		Assert.assertNotNull(manager.get(Select.PricingType.byId(1)));
//	}
//	
//	@Test
//	public void saveDepServiceTest() {
//		DepServiceDAO ds = new DepServiceDAO();
//		ds.setDepository((DepositoryDAO)manager.get(Select.Depository.byId(138)));
//		ds.setDescription("Тестовая услуга депозитария - описание");
//		ds.setFee(10);
//		ds.setCurrency((CurrencyDAO)manager.get(Select.Currency.byId(157)));
//		ds.setName("Услуга 1 депозитария 138");
//		ds.setPricingType((PricingTypeDAO)manager.get(Select.PricingType.byId(1)));
//		int id = -1;
//		id = (int) manager.save(ds);
//		Assert.assertTrue(id>0);
//	}
//	
//	@Test
//	public void getDepServiceTest() {
//		Assert.assertNotNull(manager.get(Select.DepService.byId(1)));
//	}
//	
//	@Test
//	public void saveDepServicePlanTest() {
//		DepServicePlanDAO dsp = new DepServicePlanDAO();
//		dsp.setDepository((DepositoryDAO)manager.get(Select.Depository.byId(138)));
//		dsp.setSubscriptionFee(30);
//		dsp.setCurrency((CurrencyDAO)manager.get(Select.Currency.byId(157)));
//		int id = -1;
//		id = (int) manager.save(dsp);
//		Assert.assertTrue(id>0);
//	}
//	
//	@Test
//	public void getDepServicePlanTest() {
//		Assert.assertNotNull(manager.get(Select.DepServicePlan.byId(1)));
//	}
//	
//	@Test
//	public void saveBrokServiceTest() {
//		BrokerServiceDAO bs = new BrokerServiceDAO();
//		bs.setBroker((BrokerDAO)manager.get(Select.Broker.byId(145)));
//		bs.setDescription("Подробное описание тестовой услуги брокера");
//		bs.setName("Название услуги");
//		bs.setPricingType((PricingTypeDAO)manager.get(Select.PricingType.byId(1)));
//		bs.setFee(20);
//		bs.setCurrency((CurrencyDAO)manager.get(Select.Currency.byId(157)));
//		int id = -1;
//		id = (int) manager.save(bs);
//		Assert.assertTrue(id>0);
//	}
//	
//	@Test
//	public void getBrokServiceTest() {
//		Assert.assertNotNull(manager.get(Select.BrokerService.byId(1)));
//	}
//	
//	@Test
//	public void saveBrokServicePlanTest() {
//		BrokServicePlanDAO bsp = new BrokServicePlanDAO();
//		bsp.setBroker((BrokerDAO)manager.get(Select.Broker.byId(145)));
//		bsp.setSubscriptionFee(100);
//		bsp.setCurrency((CurrencyDAO)manager.get(Select.Currency.byId(157)));
//		int id = -1;
//		id = (int) manager.save(bsp);
//		Assert.assertTrue(id>0);
//	}
//	
//	@Test
//	public void getBrokServicePlanTest() {
//		Assert.assertNotNull(manager.get(Select.BrokServicePlan.byId(1)));
//	}
}