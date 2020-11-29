package com.cg.eis.bean;

import com.cg.eis.service.Designation;
import com.cg.eis.service.InsuranceScheme;

public class Employee {

	private Integer empId;
	private String ename;
	private Double salary;
	private Designation designation;
	private InsuranceScheme InsuranceScheme;
	
	
	public Employee() {
		
	}
	
	
	public Employee(Integer empId, String ename, Double salary, Designation designation,
			com.cg.eis.service.InsuranceScheme insuranceScheme) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.salary = salary;
		this.designation = designation;
		InsuranceScheme = insuranceScheme;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Designation getDesignation() {
		return designation;
	}
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}
	public InsuranceScheme getInsuranceScheme() {
		return InsuranceScheme;
	}
	public void setInsuranceScheme(InsuranceScheme insuranceScheme) {
		InsuranceScheme = insuranceScheme;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", salary=" + salary + ", designation=" + designation
				+ ", InsuranceScheme=" + InsuranceScheme + "]";
	}
	
	
	
}
