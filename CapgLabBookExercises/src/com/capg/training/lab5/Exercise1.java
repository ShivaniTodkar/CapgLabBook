package com.capg.training.lab5;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	
		public InvalidAgeException(String string)
		{
			System.out.println(string);
		}
	
}


public class Exercise1 {

	public static void main(String[] args) 
	{
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter age: ");
			int age=scanner.nextInt();
			scanner.close();
			
			try {
				if(age<15)
					throw new InvalidAgeException("Invalid Age...Age should be more than 15 years");
				else
					System.out.println("Valid Age");
			}catch(InvalidAgeException e) {
				System.out.println(e);
			}
	}

}
