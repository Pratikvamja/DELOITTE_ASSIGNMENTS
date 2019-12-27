
public class Employee implements Comparable {

	private int empID;
	private String name;
	private String designation;
	
	public Employee(int empID,String name,String designation)
	{
		this.empID=empID;
		this.name=name;
		this.designation=designation;
	}
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public int compareTo(Object o) {
		Employee emp=(Employee) o;
		String name1=emp.getName();
		String name2=this.getName();
		
		return name2.compareTo(name1);
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", designation=" + designation + "]";
	}
	
	
	
}
