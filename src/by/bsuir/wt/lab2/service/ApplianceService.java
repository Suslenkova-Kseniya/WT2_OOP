package by.bsuir.wt.lab2.service;

import by.bsuir.wt.lab2.entity.Appliance;
import by.bsuir.wt.lab2.entity.criteria.Criteria;

public interface ApplianceService {	
	
	Appliance find(Criteria criteria);
	
}
