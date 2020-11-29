package com.cg.training.lab9.ui;

import java.util.Scanner;

import com.cg.training.lab9.service.Exercise1;

public class Exercise1Tester {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		Exercise1 object=(double num1,double num2)->{
			return (int) Math.pow(num1,num2);	
		};
		System.out.println("Enter number:");
		int num1,num2;
		num1= scanner.nextInt();
		System.out.println("Enter power: ");
		num2= scanner.nextInt();
		scanner.close();
		
		double result=object.findPowerOf(num1,num2);
		System.out.println(num1 +" raise to "+num2+" is :"+result);
		
		
	}

	
}
