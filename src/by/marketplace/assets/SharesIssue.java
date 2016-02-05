package by.marketplace.assets;

import java.util.Date;

import by.marketplace.bank.Account;
import by.marketplace.emitent.Emitent;

/**
 * Объекты этого класса представляют выпуск
 * акций в целом
 * 
 * @author A.Lagunov
 *
 */
public class SharesIssue {
	
	/**
	 * Эмитент
	 */
	private Emitent emitent;
	
	/**
	 * Тикер
	 */	
	private String ticker;
	
	/**
	 * Дата регистрации
	 */
	private Date regdate;

	/**
	 * Номер регистрации
	 */
	private String regnumber;
	
	/**
	 * Код выпуска
	 */
	private String code;
	
	/**
	 * Номер выпуска
	 */
	private int number;
	
	/**
	 * Серия выпуска
	 */
	private String batch;
	
	/**
	 * Номинальная стоимость
	 */
	private double nominalValue;
	
	/**
	 * Валюта номинала
	 */
	private Currency currency;
	
	/**
	 * Объем выпуска в валюте номинала
	 */
	private double volume;
	
	/**
	 * Количество в выпуске
	 */
	private int quantity;
	
	/**
	 * Привелигированные?
	 */
	private boolean privileged;
	
	/**
	 * Дата регистрации доп эмиссии
	 */
	private Date followOnDate;
	
	/**
	 * Объём доп эмиссии
	 */
	private double followOnVolume;
	
	/**
	 * Частичное аннулирование
	 */
	private boolean partlyAnnulation;
	
	/**
	 * Дата передачи на централизованное хранение
	 */
	private Date storeDate;

}
