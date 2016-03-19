package by.marketplace.logic;

import javax.inject.Inject;

import by.marketplace.repository.Repository;
import by.marketplace.repository.vo.DepositoryVO;

public class DepositoryServiceImpl implements DepositoryService {
	
	@Inject private Repository<Depository, DepositoryVO> repository;

	@Override
	public Repository<Depository, DepositoryVO> getRepository() {
		return repository;
	}

}
