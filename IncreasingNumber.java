import java.util.Scanner;

public class IncreasingNumber {
	
	public boolean checkNumber(int n)
	{
		int rem1=0,rem,temp=n;
		boolean flag=false;
		while(temp!=0)
		{
			rem=temp%10;
			temp=temp/10;
			
			if(rem<rem1){
				flag=true;
				return flag;
			}
			System.out.println(rem+" "+rem1);
			rem1=rem;
			//System.out.println(rem+" "+rem1);
		}
		return flag;
	}

	public static void main(String[] args) {
		int n;
		IncreasingNumber in=new IncreasingNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter natural no. n");
		n=sc.nextInt();
		boolean flag=in.checkNumber(n);
		if(flag==true)
			System.out.println("it is an increasing no");
		else 
			System.out.println("it is not an increasing no");

	}

}
