package com.cg.eis.pl;

import java.util.List;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class EISTester {

	private static EmployeeService service=new EmployeeServiceImpl();
	private static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {

		while(true) {
			System.out.println("Enter 1.Add Employee\n2.List Employees by Insurance Scheme\n3.Delete Employee\n4.List All Employees");
			int option=Integer.parseInt(scanner.nextLine());
			try {
			switch(option) {
			case 1:Employee employee=new Employee();	//empty object/dummy object
					Integer empId=addEmployee(employee);
					System.out.println("Added :"+empId);
					break;
			case 2:System.out.println("Enter insurance scheme ");
					String scheme=scanner.nextLine();
					List<Employee> empList=getEmployeesByInsuranceScheme(scheme);
					empList.stream().forEach(System.out::println);
					break;
			case 3:	System.out.println("Enter employee id ");
					empId=Integer.parseInt(scanner.nextLine());
					int id=deleteEmployee(empId);
					System.out.println("Employee "+id+" deleted");
					break;
			case 4:
 			default: System.out.println("Invalid option");
			break;
				}
			
			}catch(EmployeeException e) {
				e.printStackTrace();
			}
			System.out.println("Enter y to continue ");
			String ch=scanner.nextLine();
			if(!ch.equalsIgnoreCase(ch)) {
				break;
			}
		}
	}

	private static int deleteEmployee(Integer empId) throws EmployeeException {
		return service.deleteEmployee(empId);
	}

	private static List<Employee> getEmployeesByInsuranceScheme(String scheme) throws EmployeeException {

		List<Employee> empList=service.getEmployeesByInsuranceScheme(scheme);
		return null;
	}

	private static Integer addEmployee(Employee employee) throws EmployeeException {

		System.out.println("Enter employee id: ");
		employee.setEmpId(Integer.parseInt(scanner.nextLine()));
		System.out.println("Enter employee name: ");
		employee.setEname(scanner.nextLine());
		System.out.println("Enter employee salary: ");
		employee.setSalary(Double.parseDouble(scanner.nextLine()));
		Integer empId=service.addEmployee(employee);
		return empId;
		
	}

}
