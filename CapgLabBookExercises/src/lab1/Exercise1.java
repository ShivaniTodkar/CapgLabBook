package lab1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String args[])
	{
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of digit");
		int n=sc.nextInt();
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println(num);
		int sum=0;
		sc.close();
		for(int i=0;i<=n;i++)
		{
		while(num!=0)
		{
			int r=num%10;
			sum=sum+(r*r*r);
			num=num/10;
		}
		}
		System.out.println(sum);
	}
	
}
