package by.marketplace.logic;

import by.marketplace.repository.Repository;

public interface Service<T extends ConstructableFromVo<?>,U> {
	public Repository<T, U> getRepository();
}
