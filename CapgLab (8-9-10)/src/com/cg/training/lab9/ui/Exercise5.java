package com.cg.training.lab9.ui;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Exercise5 {

	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter number to find factorial:");
		int number=scanner.nextInt();
		
		UnaryOperator<Integer> fact=(num)->{
			int temp=num,factorial=1;
			while(temp!=0)
			{
				factorial=factorial*temp--;
			}
			return factorial;
		};
		
		System.out.println("Factorial is:"+fact.apply(number));
	
		
	}
	
}
