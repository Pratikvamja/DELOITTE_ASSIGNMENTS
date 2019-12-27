import java.util.Scanner;

public class CalcDiff {

	public int calculateDifference(int n)
	{
		int sqsum=0,sum=0,diff;
		for(int i=1;i<=n;i++)
		{
			sqsum=sqsum+(i*i);
		}
		sum=(n*(n+1))/2;
		diff=sqsum-(sum*sum);
		return diff;
	}
	
	public static void main(String[] args) {
		int n;
		CalcDiff d=new CalcDiff();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter natural no. n");
		n=sc.nextInt();
		int diff=d.calculateDifference(n);
		System.out.println("difference between sum of squares and square of sum is :"+diff);
		

	}

}
