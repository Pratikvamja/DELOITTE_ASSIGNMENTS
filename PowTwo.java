import java.util.Scanner;

public class PowTwo {
	
	public boolean checkNumber(int n)
	{
		int binaryval=Integer.parseInt(Integer.toBinaryString(n).substring(1));
		if(binaryval==0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int n;
		PowTwo p=new PowTwo();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter natural no. n");
		n=sc.nextInt();
		boolean flag=p.checkNumber(n);
		if(flag==true)
			System.out.println("it is an power of 2");
		else 
			System.out.println("it is not a power of 2");
	}

}
