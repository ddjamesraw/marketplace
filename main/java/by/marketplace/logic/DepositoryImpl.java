package by.marketplace.logic;

import by.marketplace.repository.vo.DepositoryVO;

public class DepositoryImpl implements Depository{

	@Override
	public void constructFromVO(Object object) {
		DepositoryVO vo = DepositoryVO.class.cast(object);
		this.id = vo.getId();
		this.name = vo.getName();
	}
	
	@Override
	public DepositoryVO getVO() {
		DepositoryVO dep = new DepositoryVO();
		dep.setName(name);
		return dep;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int getId() {
		return id;
	}
	
	private int id;
	
	private String name;
}
