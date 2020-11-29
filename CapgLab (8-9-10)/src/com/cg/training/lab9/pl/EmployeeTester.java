package com.cg.training.lab9.pl;

import java.util.Map;

import com.cg.training.lab9.service.EmployeeService;

public class EmployeeTester {

private static EmployeeService service= new EmployeeService();
	
	public static void main(String[] args) {
		double totalSal= service.sumOfSalaries();
		System.out.println("Total salary= "+ totalSal);
		
		System.out.println("Department Count");
		Map<String,Long> map= service.getDepartments();	       
        map.forEach((dept, count) -> {
            System.out.println(dept + " -> " + count);
        });
        
        System.out.println("Printing Senior Employee ");
        service.findSeniorMostEmp();
        
        System.out.println("Printing Employee Service DUration");
        service.employeeServiceDuration();
        
        System.out.println("Printing Employee without Department");
        service.listEmployeesWithoutDepartment().stream()
        .forEach(System.out::println);
        
        System.out.println("Printing Hire Details");
        service.showHireDetails();
        
        System.out.println("Printing Employess starting work on Friday");
        service.employeesStartingFriday()
        .stream()
        .forEach(System.out::println);
        
        System.out.println("Printing employees who didn’t report to anyone");
        service.getEmployeesWithoutManager()
        .stream().forEach(System.out::println);
        
        System.out.println("Sorted by department Id");
        service.sortByDeptId().stream().forEach(System.out::println);
        
        System.out.println("Accept first name and last name of manager to print name of all his/her subordinates.  ");
        service.getSubordinates("Steven", "King");
	}
	
}
