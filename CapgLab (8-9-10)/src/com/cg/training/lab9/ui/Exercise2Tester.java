package com.cg.training.lab9.ui;

import java.util.Scanner;

import com.cg.training.lab9.service.Exercise2;

public class Exercise2Tester {

	public static void main(String[] args) {

		Exercise2 object=(String string)->{
			return (string.replace("", " ").trim());

		};
		
		//OR
		
		/*Exercise2 object1=(string1)->{
			String string2="";
			for(int i=0;i<string1.length();i++)
			{
				string2+=string1.charAt(i)+" ";
			}
			return string2;
		};*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string: ");
		String input=sc.nextLine();
		String output=object.format(input);
		System.out.println(output);
		sc.close();
	}

	

}
