package by.bsuir.wt.lab2.dao;

import by.bsuir.wt.lab2.entity.Appliance;
import by.bsuir.wt.lab2.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO {
	List<Appliance> find(Criteria criteria);

	void save(List<Appliance> appliences);

	List<Appliance> parseAll();
}
