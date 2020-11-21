package lab1;

import java.util.Scanner;

public class Exercise3 {
	
	
	public static int a=0,b=1;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value for fibonacci series");
		int n=sc.nextInt();
		System.out.println(a+"\n"+b);
		fib(n-2);	//recursive
		sc.close();
//		for(int i=0;i<n;i++)		//non-recursive method
//		{
//			int c=a+b;
//			System.out.println("\n"+c);
//			a=b;
//			b=c;
//		}
	}
	public static void fib(int n)
	{
		
		if(n>0)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			fib(n-1);
		}
	}
	

}
