package by.marketplace.depository;

import java.util.HashMap;

public class Depositories{
	
	private static final HashMap<DepositoriesList,Depository> instances = new HashMap<DepositoriesList,Depository>();
	
	private Depositories(){}
	
	public static Depository getInstance(DepositoriesList dep) {
		if (instances.containsKey(dep)) return instances.get(dep);
		Depository newDep = new Depository(dep.getId());
		instances.put(dep, newDep);
		return newDep;
	}

}
