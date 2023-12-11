package com.veeranji.SpringJDBC1.BusinessLayer;

import com.veeranji.SpringJDBC1.Dao.EmployeeDao;
import com.veeranji.SpringJDBC1.pojo.Employee;

public class EmployeeBusinessImpl implements EmployeeBusiness {
	private EmployeeDao employeeDao;

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void insertEmployee(Employee employee) {
		employeeDao.insertEmployee(employee);
		
		
	}

		

}
