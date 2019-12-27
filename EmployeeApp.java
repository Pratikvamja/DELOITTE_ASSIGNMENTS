import java.util.Arrays;
public class EmployeeApp {

	public static void main(String[] args) {

		Employee emp[]=new Employee[10];
		emp[0]=new Employee(1,"Pratik","CEO");
		emp[1]=new Employee(102,"Yash","COO");
		emp[2]=new Employee(103,"Nirnai","CTO");
		emp[3]=new Employee(104,"Abhay","MD");
		emp[4]=new Employee(105,"Abhi","CA");
		emp[5]=new Employee(106,"Bhakti","HR");
		emp[6]=new Employee(107,"Abdul","TnA");
		emp[7]=new Employee(108,"Ankit","BTA");
		emp[8]=new Employee(109,"Iqbal","AA");
		emp[9]=new Employee(110,"Vedanth","Manager");
		Arrays.sort(emp);
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i]);
		}
	}

}
