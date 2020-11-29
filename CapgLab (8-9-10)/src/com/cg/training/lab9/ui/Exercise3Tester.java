package com.cg.training.lab9.ui;

import java.util.Scanner;

import com.cg.training.lab9.service.Exercise3;

public class Exercise3Tester {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		Exercise3 object=(username,password)->
		{
			if(username.equals("User") && password.equals("Pass"))
			{
				return true;
			}
			return false;
		};
		
		System.out.println("Enter Username:");
		String username=scanner.nextLine();
		System.out.println("Enter Password:");
		String password=scanner.nextLine();
		Boolean result=object.authentication(username, password);
		scanner.close();
		if(result)
		{
			System.out.println("Logged in successfully.");
		}
		else
		{
			System.out.println("Username or password is wrong.");
		}
		
	}

}
