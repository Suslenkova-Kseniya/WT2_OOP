package by.bsuir.wt.lab2.dao;

import by.bsuir.wt.lab2.entity.Appliance;
import by.bsuir.wt.lab2.entity.criteria.Criteria;

public interface ApplianceDAO {
	Appliance find(Criteria criteria);
}
