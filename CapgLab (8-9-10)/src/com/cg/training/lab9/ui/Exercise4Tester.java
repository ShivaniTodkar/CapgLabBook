package com.cg.training.lab9.ui;

import java.util.Scanner;

import com.cg.training.lab9.service.Exercise4;

public class Exercise4Tester {	
		
		private String string;
		
		
		public String getString() {
			return string;
		}


		public void setString(String string) {
			this.string = string;
		}

	
	public static void main(String[] args) {


		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any string:");
		String string = scanner.nextLine();
		scanner.close();
		
		Exercise4Tester object = new Exercise4Tester(); 
		
		object.setString(string);
	    Exercise4 obj = object::getString;
	    System.out.print("The string is: "+obj.getString());
		
	}

}
