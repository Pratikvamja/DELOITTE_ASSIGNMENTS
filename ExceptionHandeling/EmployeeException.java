package ExceptionHandeling;

public class EmployeeException extends Exception {
	String message;
	public EmployeeException(){
		
	}
	public EmployeeException(String message){
		this.message=message;
	}
	
	public String toString()
	{
		if(message==null)
			return "you cannot afford more than 2 employees :(";
		else 
			return message;
	}

}
