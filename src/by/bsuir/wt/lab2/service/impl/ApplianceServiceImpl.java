package by.bsuir.wt.lab2.service.impl;

import by.bsuir.wt.lab2.dao.ApplianceDAO;
import by.bsuir.wt.lab2.dao.DAOFactory;
import by.bsuir.wt.lab2.entity.Appliance;
import by.bsuir.wt.lab2.entity.criteria.Criteria;
import by.bsuir.wt.lab2.service.ApplianceService;
import by.bsuir.wt.lab2.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public Appliance find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		Appliance appliance = applianceDAO.find(criteria);
		
		// you may add your own code here
		
		return appliance;
	}

}

//you may add your own new classes
