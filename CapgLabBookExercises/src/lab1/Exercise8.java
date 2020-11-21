package lab1;

import java.util.Scanner;

public class Exercise8 {

	
	static boolean powerOfTwo(int number)
	{
	 
	  if (number == 1) 
	    return true;  
	  else if (number % 2 != 0 ||  number ==0) 
	    return false; 
	 
	  return powerOfTwo(number / 2); 
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any number");
		int number=scanner.nextInt();
		scanner.close();
		if(powerOfTwo(number)==true)
		{
			System.out.println(number+" is power of 2 ");
		}
		else
		{
			System.out.println(number+" is not power of 2 ");

		}
	}

}
