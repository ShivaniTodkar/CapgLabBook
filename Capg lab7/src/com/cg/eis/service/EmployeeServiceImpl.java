package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;
import com.cg.eis.data.EmployeeDAO;
import com.cg.eis.data.EmployeeDaoImpl;
import com.cg.eis.exception.EmployeeException;

public class EmployeeServiceImpl implements EmployeeService{

	//loose coupling
	private EmployeeDAO employeeDao=new EmployeeDaoImpl();
	
	@Override
	public Integer addEmployee(Employee employee) throws EmployeeException {
		try {
			double sal=employee.getSalary();
			if(sal >=40000.0 ) {
				employee.setDesignation(Designation.Manager);
				employee.setInsuranceScheme(InsuranceScheme.Scheme_A);
			}else if(sal>= 20000.0) {
				employee.setDesignation(Designation.Programmer);
				employee.setInsuranceScheme(InsuranceScheme.Scheme_B);
			}else if(sal >5000) {
				employee.setDesignation(Designation.System_Associate);
				employee.setInsuranceScheme(InsuranceScheme.Scheme_C);
			}else {
				employee.setDesignation(Designation.Clerk);
				employee.setInsuranceScheme(InsuranceScheme.No_Scheme);
			}
			
			Integer empid=employeeDao.addEmployee(employee);
			return empid;
		}catch(Exception e) {
			throw new EmployeeException(e.getMessage());
		}
		
	}

	@Override
	public Integer deleteEmployee(Integer empid) throws EmployeeException {
		try {
			Integer id=employeeDao.deleteEmployee(empid);
			return id;
		}catch(Exception e) {
			throw new EmployeeException(e.getMessage());
		}
	}

	@Override
	public List<Employee> getEmployeesByInsuranceScheme(String insuranceScheme) throws EmployeeException {
		try {
			InsuranceScheme scheme=null;			
			
			if(insuranceScheme.equalsIgnoreCase(InsuranceScheme.Scheme_A.getScheme())) {
				scheme= InsuranceScheme.Scheme_A;
			}else if(insuranceScheme.equalsIgnoreCase(InsuranceScheme.Scheme_B.getScheme())) {
				scheme=InsuranceScheme.Scheme_B;
			}else if(insuranceScheme.equalsIgnoreCase(InsuranceScheme.Scheme_C.getScheme())) {
				scheme=InsuranceScheme.Scheme_C;
			}else {
				scheme=InsuranceScheme.No_Scheme;
			}
			System.out.println(scheme);
			List<Employee> empList=
					employeeDao.getEmployeesByInsuranceScheme(scheme);
			return empList;
		}catch(Exception e) {
			throw new EmployeeException(e.getMessage());
		}
	}

	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {
		try {
			List<Employee> employeeList= employeeDao.getAllEmployees();
			return employeeList;
		}catch(Exception e) {
			throw new EmployeeException(e.getMessage());
		}
		
	}


}
