package com.cg.eis.exception;

public class EmployeeException extends Exception {

	public EmployeeException()
	{
		
	}
	public String toString()
	{
		return "\n Salary is below $3,000\n";
	}

	
}
