package com.capg.training.lab5;

import java.util.Scanner;

class ValidNameException extends Exception{
	
	public ValidNameException(String string) {
		super(string);
	}
	
}



public class Exercise2 {

	public static void main(String[] args) 
	{

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstName=scanner.nextLine();
		System.out.println("Enter last name: ");
		String lastName=scanner.nextLine();
		scanner.close();
		
		try {
			
			if(firstName.contentEquals(null) && lastName.contentEquals(null))
				throw new ValidNameException("First name and last name cannot be blank ");
			else
				System.out.println("Valid!!");
			
		}catch(ValidNameException e) {
			
			System.out.println(e);
			
		}
	}

}
