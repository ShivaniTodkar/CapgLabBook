package lab1;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) 
	{
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int number=scanner.nextInt();
		scanner.close();
		if(checkNumber(number)==true)
		{
			System.out.println(number+" is a increasing number");
		}
		else
		{
			System.out.println(number+" is not a increasing number");

		}
		
	}

	private static boolean checkNumber(int number) 
	{
		boolean flag=true;
		int remainder=number%10;
		while(number!=0)
		{
			int newRemainder=number%10;
			if(remainder<newRemainder)
			{
				flag=false;
				break;
			}
			else
				
			{
				remainder=newRemainder;
			}
			 number=number/10;
		}
		
		return flag;
	}

}
