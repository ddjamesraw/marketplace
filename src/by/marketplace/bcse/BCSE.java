package by.marketplace.bcse;

import by.marketplace.assets.Currency;
import by.marketplace.assets.Money;
import by.marketplace.assets.Tradeable;

/**
 * <p>Only one instance of BCSE should exist</p>
 * <p>Represent belarusian currency & stock exchange (BCSE)</p>
 * @author A.Lagunov
 *
 */
public class BCSE {

	private static final BCSE instance = new BCSE();
	
	private BCSE(){	}
	
	public static BCSE getInstance() {
		return instance;
	}
	
	public Money getAverageMarketPrice(Tradeable asset) {
		//Should connect to DBA
		//Creating adaptor for now
		return new Money(1000,Currency.USD);
	}

}
