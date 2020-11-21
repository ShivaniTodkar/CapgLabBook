package lab2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements----");
		int size=sc.nextInt();
		
		Integer arr[]=new Integer[size];
		
		System.out.println("Enter elements of array : ");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		sc.close();
		getSorted(arr);
		
	
	}

	private static void getSorted(Integer[] arr) 
	{
		Collections.reverse(Arrays.asList(arr));
		System.out.println("---Reverse order array--- ");
		System.out.println(Arrays.toString(arr));
		
		
		System.out.println("---Sorted list of array---");
		Arrays.sort(arr);
		for (Integer integer : arr) 
		{
			System.out.println(integer);
		}
	}

}
