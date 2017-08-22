package com.rajeev.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.rajeev.dao.RegistraionServiceDao;
import com.rajeev.model.UserDetail;
import com.rajeev.service.RegistrationService;

public class RegistrationServiceImpl implements RegistrationService {


	@Autowired
	private RegistraionServiceDao dao;
	
	
	/*public void saveEmployee(Employee employee) {
		dao.saveEmployee(employee);
	}*/
	public void saveEleaveUserDetail(UserDetail userDetail) {
		dao.saveUserDetail(userDetail);
		
	}


	

}
