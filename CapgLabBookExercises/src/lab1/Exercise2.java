package lab1;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Select one of the three lights\n1.red\n2.yellow\n3.green");
		String choice=sc.next();
		sc.close();
		if(choice.equals("1"))
		{
			System.out.println("Stop");	
		}
		if(choice.equals("2"))
		{
			System.out.println("Ready");	
		}
		if(choice.equals("3"))
		{
			System.out.println("Go");	
		}
		
		
	}

}
