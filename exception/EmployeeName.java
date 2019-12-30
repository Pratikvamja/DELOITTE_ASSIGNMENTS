package com.cg.eis.exception;

import java.util.Scanner;

import ExceptionHandeling.EmpNameException;

public class EmployeeName 
{
	String fname,lname;
	
	EmployeeName(String fname,String lname)
	{
		this.fname=fname;
		this.lname=lname;
	}
	
	public void validateFullName()throws EmpNameException
	{
		if(fname.isEmpty()||lname.isEmpty())
		{
			throw new EmpNameException();
		}
		else
		{
			System.out.println("Full Name : "+fname+" "+lname);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		boolean check=false;
		String fname,lname="";
		do
		{
			System.out.print("Enter First Name");
			fname=sc.nextLine();
			if(!fname.matches("[a-zA-Z\\n]*"))
			{
				System.out.println("INVALID FIRST NAME");
			}
			else
			{
				System.out.print("Enter Last Name");
				lname=sc.nextLine();
				if(!lname.matches("[a-zA-Z\\n]*"))
				{
					System.out.println("INVALID LAST NAME");
				}
				else
				{
					check=true;
				}
			}
		}while(!check);
		EmployeeName en=new EmployeeName(fname,lname);
		try{
		en.validateFullName();
		}
		catch(EmpNameException ene)
		{
			System.err.print(ene);
			main(args);
		}
		sc.close();
	}
}