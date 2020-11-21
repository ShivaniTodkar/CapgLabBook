package com.cg.is.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {

	
	public abstract void getEmployeeDetails(Employee emp);
	public abstract String findInsuranceScheme(Employee emp);
	public abstract void showEmployeeDetails(Employee emp);
	
}
