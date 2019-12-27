import java.util.Scanner;

public class Divisible {
	
	public int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
				sum+=i;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n;
		Divisible d=new Divisible();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter natural no. n");
		n=sc.nextInt();
		int sum=d.calculateSum(n);
		System.out.println("sum of n natural no. divisible by 3 & 5 are : "+sum);
		

	}

}
