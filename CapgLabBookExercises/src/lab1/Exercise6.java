package lab1;

import java.util.Scanner;

public class Exercise6 {
	static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for the value of n");
		n=sc.nextInt();
		sc.close();
		System.out.println(calculateDifference(n));
		
	}

	public static int calculateDifference(int n)
	{
		int diff=0;
		int sum=0,sum1=0;
		for(int i=0;i<=n;i++)
		{
			int square=i*i;
			sum=sum+square;
		}
		//System.out.println(sum);
		for(int i=0;i<=n;i++)
		{
			sum1=sum1+i;
		}
		int sq=sum1*sum1;
		//System.out.println(sq);

		diff=sq-sum;
		return diff;
	}
}
