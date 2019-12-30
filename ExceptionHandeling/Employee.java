package ExceptionHandeling;

import java.util.Scanner;

public class Employee {

	private int id;
	private String name;
	public Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public static void verify(int i) throws EmployeeException
	{
		if(i>1)
		{
			throw new EmployeeException("you cannot have so many employees");
		}
		else
			System.out.println("you have funds");
	}
	
	public static void main(String[] args) {
		Employee e[]=new Employee[10];
		int i=0;
		Scanner sc=new Scanner(System.in);
		try{
		while(true)
		{
			
			System.out.println("enter employee id & name");
			
			e[i]=new Employee(sc.nextInt(),sc.next());
			verify(i);
			i++;
		}
		}
		catch(EmployeeException exp)
		{
			System.out.println(exp);
		}
		
	}

}
