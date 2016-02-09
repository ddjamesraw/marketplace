package by.marketplace.entities;
/**
 * Economic entity
 * 
 * Every economic entity, be it company or person
 * should have unique identifier
 * 
 * @author A.Lagunov
 *
 */
public class Entity {
	
	private final Identifier id;

	public Entity(Identifier id) {
		this.id = id;
	}

	public Identifier getId() {
		return id;
	}

}
