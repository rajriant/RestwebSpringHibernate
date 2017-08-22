package com.rajeev.dao.impl;

import com.rajeev.dao.AbstractDao;
import com.rajeev.dao.RegistraionServiceDao;
import com.rajeev.model.UserDetail;

public class RegistrationServiceDaoImpl extends AbstractDao implements RegistraionServiceDao{

	
	public void saveUserDetail(UserDetail userDetail) {
		persist(userDetail);
		
	}	
}
