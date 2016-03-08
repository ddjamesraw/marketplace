package by.marketplace.DAO.entities;

import javax.persistence.*;

@Entity
@Table(name = "currency")
@DiscriminatorValue("3")
public class CurrencyDAO extends AssetDAO {

	@Column(name = "cur_name", length = 45)
	private String name;

	@Column(name = "cur_short_name", length = 45)
	private String shortName;
	
	@Column(name = "cur_symbol", length = 1)
	private char symbol;
	
	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

enum CurrencyEnum {
	BYN(0), BYR(1), USD(2), EUR(3), RUR(4);
	
	private CurrencyEnum(int id) {
		this.id = id;
	}
	
	private int id;

	public int getId() {
		return id;
	}
}
