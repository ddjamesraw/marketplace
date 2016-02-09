package by.marketplace.entities;

/**
 * Unique identifier which use is to identify economic 
 * entities (may be UNN or identifier from a passport)
 * 
 * Classes that implement this interface must provide
 * method to assert their identities
 * 
 * @author A.Lagunov
 *
 */

public interface Identifier {
	
	public boolean equals(Identifier id);

}
