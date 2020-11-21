package com.cg.is.service;

import java.util.Scanner;

import com.cg.eis.bean.Designation;
import com.cg.eis.bean.Employee;

public class EmployeeServiceDemo implements EmployeeService{

	
	
	public EmployeeServiceDemo(){
		
	}
	private static Scanner sc = new Scanner(System.in);

	
	@Override
	public void getEmployeeDetails(Employee employee) 
	{
		System.out.println("Enter employee details:");
		System.out.println("----------------------");

		System.out.println("Enter employee id:");
		employee.setId(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Enter employee name:");
		employee.setName(sc.nextLine());
		
		System.out.println("Enter employee salary:");
		employee.setSalary(Double.parseDouble(sc.nextLine()));
		
		System.out.println("Enter employee designation(Manager,Programmer,Analyst,Batch_Mentor):");
		String designation = sc.nextLine();
		
		if(designation.equalsIgnoreCase("Manager"))
			employee.setDesignation(Designation.Manager);
		else if (designation.equalsIgnoreCase("Programmer"))
			employee.setDesignation(Designation.Programmer);
		else if(designation.equalsIgnoreCase("Analyst"))
			employee.setDesignation(Designation.Analyst);
		else if(designation.equalsIgnoreCase("Batch_Mentor"))
			employee.setDesignation(Designation.Batch_Mentor);
		
		
	}

	@Override
	public String findInsuranceScheme(Employee emp) 
	{
		
		// set insurance scheme based on designation and salary
				/*
				 * Salary				Designation			Insurance scheme
				 * >20000 and < 50000	Manager				Scheme 1
				 * >=20000 and <40000	Programmer			Scheme 2
				 * >=25000 and <35000	Analyst				Scheme 3
				 * >20000 and <40000	Batch_Mentor		Scheme 4
				 */
		
		Designation designation = emp.getDesignation();
		Double salary = emp.getSalary();
		String scheme = null;
		
		if(designation.equals(Designation.Manager	) && (salary > 20000 && salary < 50000))
			scheme = "Scheme 1";
		else if(designation.equals(Designation.Programmer) && (salary >= 20000 && salary < 40000))
			scheme = "Scheme 2";
		else if(designation.equals(Designation.Analyst) && (salary >= 25000 && salary < 35000))
			scheme = "Scheme 3";
		else if(designation.equals(Designation.Batch_Mentor) && (salary >20000 && salary <40000))
			scheme = "Scheme 4";
		
		emp.setInsuranceScheme(scheme);
		return scheme;
		
	}

	@Override
	public void showEmployeeDetails(Employee emp) 
	{
		System.out.println("Employee Details:");
		System.out.println(emp);
	}

}
