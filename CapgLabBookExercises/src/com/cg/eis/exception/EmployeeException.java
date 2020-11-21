package com.cg.eis.exception;



	public class EmployeeException extends Exception
	{
		int salary;
		public EmployeeException()
		{
			
		}
		public EmployeeException(int salary)
		{
			this.salary=salary;
		}
		public String getMessage()
		{
			return "Salary is below than 3000.";
			
		}
	}
	

