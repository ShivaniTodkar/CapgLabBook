package com.cg.training.lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Map<Integer, String> myList = new HashMap<>();		
		getValues(myList);		
	}

	private static void getValues(Map<Integer, String> myList) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String [] arr=new String[size];
		Integer[] arr1=new Integer[size];
	
		for (int i = 0; i <size; i++) {
				System.out.println("Enter key value");
				arr1[i]=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter String value");
				arr[i]=sc.nextLine();
				
				myList.put(arr1[i],arr[i]);
		}
		sc.close();
			
		for (Map.Entry<Integer, String> e : myList.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}	
	}
	
}
