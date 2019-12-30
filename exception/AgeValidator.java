package com.cg.eis.exception;

import java.util.Scanner;

public class AgeValidator {
	int age;
	public AgeValidator(int age)
	{
		this.age=age;
	}
	public void validate() throws Exception
	{
		if(age>15)
		{
			System.out.println("valid age");
		}
		else
			throw new AgeException();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age:");
		
		AgeValidator av=new AgeValidator(sc.nextInt());
		try {
			av.validate();
		} catch (Exception e) {
			System.err.print(e);
			main(args);
		}
		
		
	}

}
