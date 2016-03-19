package by.marketplace.repository.vo;


/** It is not good, but because of Hibernate bug not fixed by now (28.02.2016)
 *  We have to manually set discriminator values by ourselves inside 
 *  entities' initializers
 *  see https://hibernate.atlassian.net/browse/ANN-140
 */

public enum Discriminators {
	USER(10), DEPOSITORY(11), ISSUER(12), BROKER(13);
	
	private Discriminators(int id) {
		this.id = id;
	}
	
	private int id;
	
	public int getId() {
		return id;
	}
}
