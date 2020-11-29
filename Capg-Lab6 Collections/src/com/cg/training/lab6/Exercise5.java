package com.cg.training.lab6;

import java.util.*;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		sc.close();
		int secondSmallest=getSecondSmallest(array,size);
		System.out.println(secondSmallest);
	}

	private static int getSecondSmallest(int[] array, int size) 
	{
		List<Integer> list= new ArrayList( Arrays.asList(array));
		Collections.sort(list);
		return list.get(1);
	}

}
