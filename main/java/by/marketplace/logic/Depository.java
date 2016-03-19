package by.marketplace.logic;

import by.marketplace.repository.vo.DepositoryVO;

public interface Depository extends ConstructableFromVo<DepositoryVO> {
	
	public void setId(int id);
	public int getId();
	
	public void setName(String name);
	public String getName();
}
