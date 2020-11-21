package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.is.service.EmployeeService;
import com.cg.is.service.EmployeeServiceDemo;


public class EmployeeInsuranceSceme {

public static void main(String[] args) {
		
		Employee employee = new Employee();
		EmployeeService emp = new EmployeeServiceDemo(); 
		emp.getEmployeeDetails(employee);
		System.out.println("Insurance Scheme : "+emp.findInsuranceScheme(employee));
		emp.showEmployeeDetails(employee);
	}
	
}
