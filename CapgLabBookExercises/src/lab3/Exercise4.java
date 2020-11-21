package lab3;

import java.util.Scanner;

public class Exercise4 {

	private static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		int number;
		System.out.println("Enter a number :");
		number=sc.nextInt();
		System.out.println(modifyNumber(number));
	}
	static int modifyNumber(int num)
	{
		String str=Integer.toString(num);
		int length=str.length();
		
		StringBuffer stri=new StringBuffer();
		for(int i=0;i<length-1;i++)
		{
			 int diff=Integer.parseInt(String.valueOf(str.charAt(i)))
					-Integer.parseInt(String.valueOf(str.charAt(i+1)));
			 
			stri.append(java.lang.Math.abs(diff));
		}
		stri.append(Integer.parseInt(String.valueOf(str.charAt(length-1))));
	
		String str1=new String(stri);
		num=Integer.parseInt(str1);
		return num;
		
	}
	
	
	
}
