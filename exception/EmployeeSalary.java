package com.cg.eis.exception;

import java.util.Scanner;

public class EmployeeSalary {
	int salary;
	public EmployeeSalary(int salary)
	{
		this.salary=salary;
	}
	public void validate() throws EmployeeException
	{
		if(salary>3000)
		{
			System.out.println("good salary!!");
		}
		else
			throw new EmployeeException();
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the salary:");
		
		EmployeeSalary es=new EmployeeSalary(sc.nextInt());
		try {
			es.validate();
		} catch (EmployeeException e) 
		{
			System.err.print(e);
			main(args);
		}
		
	}

}
