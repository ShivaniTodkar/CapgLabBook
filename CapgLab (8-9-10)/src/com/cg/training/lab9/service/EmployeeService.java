package com.cg.training.lab9.service;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.cg.training.lab9.bean.Employee;
import com.cg.training.lab9.dao.EmployeeRepository;

public class EmployeeService {

	public Double sumOfSalaries() {
		List<Employee> employeeList= EmployeeRepository.getEmployees();

		Optional<Double> optional= employeeList.stream()
				.map((e)->e.getSalary())
				.reduce((a,b)->a+b);

		if(optional.isPresent()) {
			return optional.get();
		}else {
			return 0.0;
		}

	}

	//List out department names and count of employees in each department
	public Map<String, Long> getDepartments()   {
		List<Employee> employeeList = EmployeeRepository.getEmployees(); 

		Map<String, Long> employeeCountByDepartment = employeeList.stream()
				.filter((emp) -> emp.getDepartment() != null )
				.collect(Collectors.groupingBy(dept -> dept.getDepartment().getDepartmentName(), 
						Collectors.counting()));
		return employeeCountByDepartment;
	}

	//Find out the senior most employee of an organization. 
	public void findSeniorMostEmp() {
		List<Employee> employeeList= EmployeeRepository.getEmployees();
		Optional<Employee> SeniorMostEmployeeWrapper=
				employeeList.stream().collect
				(Collectors.minBy(Comparator.comparing(Employee::getHireDate)));
		Employee SeniorMostEmployee = SeniorMostEmployeeWrapper.get();
		System.out.println(SeniorMostEmployee);
	}

	//List employee name and duration of their service in months and days
	public void employeeServiceDuration()     {         
		List<Employee> employeeList= EmployeeRepository.getEmployees();
		employeeList.stream()
		.forEach(e -> {
			Period period =e.getHireDate().until(LocalDate.now());
			System.out.println("Employee Id :"+e.getFirstName()+" "+e.getLastName()+
					"  Months: "+ChronoUnit.MONTHS.between(e.getHireDate(), LocalDate.now())
					+" Days: "+period.getDays());
		});
	}

	//Find out employees without department
	public List<Employee> listEmployeesWithoutDepartment()   {
		List<Employee> employeeList = EmployeeRepository.getEmployees();
		return employeeList.stream()
				.filter(emp -> (emp.getDepartment() == null))
				.collect(Collectors.toList());
	}

	//List employee name, hire date and day of week on which employee has started
	public void showHireDetails()   {
		List<Employee> employeeList = EmployeeRepository.getEmployees();
		employeeList.stream()
		.forEach((emp) -> {
			System.out.println("Name: " + emp.getFirstName() + " " + emp.getLastName() +
					" | Hire Date: " + emp.getHireDate() + " | " + emp.getHireDate().getDayOfWeek().toString());
		});
	}

	
	public List<Employee> employeesStartingFriday() {
		List<Employee> employeeList = EmployeeRepository.getEmployees().stream()
				.filter((employee) -> employee.getHireDate().getDayOfWeek().toString().equals("FRIDAY"))
				.collect(Collectors.toList());
		return employeeList;

	}


	public List<Employee> getEmployeesWithoutManager(){
		List<Employee> empList= EmployeeRepository.getEmployees()
				.stream()
				.filter((e)->e.getManagerId()==null)
				.collect(Collectors.toList());
		return empList;

	}


	public List<Employee> sortById() {
		List<Employee> empList = EmployeeRepository.getEmployees();

		return empList.stream()
				.sorted(Comparator.comparingInt(Employee::getEmployeeId))
				.collect(Collectors.toList());   
	}

	public List<Employee> sortByDeptId() {
		List<Employee> empList = EmployeeRepository.getEmployees();

		return empList.stream()
				.filter((e)->e.getDepartment() !=null)
				.sorted(Comparator.comparing((emp) -> emp.getDepartment().getDepartmentId()))
				.collect(Collectors.toList());
	}

	public List<Employee> sortByFirstName() {
		List<Employee> empList = EmployeeRepository.getEmployees();

		return empList.stream()
				.sorted(Comparator.comparing((emp) -> emp.getFirstName().toLowerCase()))
				.collect(Collectors.toList());
	}


	public List<Employee> getSubordinates(String firstName, String lastName){
		List<Employee> managerEmployeeList = 
				EmployeeRepository.getEmployees().stream()
				.filter((e)->e.getFirstName().equals(firstName) && e.getLastName().equals(lastName))
				.collect(Collectors.toList());

		return EmployeeRepository.getEmployees().stream()
				.filter((e)->e.getManagerId().equals(managerEmployeeList.get(0).getEmployeeId()))
				.collect(Collectors.toList());
	}
	
	
}
