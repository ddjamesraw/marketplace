package by.marketplace.depository;

import by.marketplace.entities.Identifier;
import by.marketplace.entities.TIN;

public enum DepositoriesList {
	BELARUSBANK(new TIN("100325912"));
	
	private Identifier id;
	
	private DepositoriesList(Identifier id) {
		this.setId(id);
	}

	public Identifier getId() {
		return id;
	}

	private void setId(Identifier id) {
		this.id = id;
	}
}
