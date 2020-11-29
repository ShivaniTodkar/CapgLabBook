package com.cg.training.lab6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Exercise3 {

	public static HashMap<Integer, Integer> getSquare(int[] array) {
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	 
	    for (int n: array) {
	      map.put( n, n*n);
	    }
	    return map;
	  }
	 
	  public static void main(String[] args) {
		  
		  Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of array");
			int size=sc.nextInt();
			int array[]=new int[size];
			System.out.println("Enter the elements of array");
			for(int i=0;i<array.length;i++)
			{
				array[i]=sc.nextInt();
			}
	    HashMap<Integer, Integer> map = getSquare(array);
	    sc.close();
	    Iterator<Integer> it = map.keySet().iterator();
	    while(it.hasNext()){
	    Integer key = it.next();
	      System.out.println(key + " : " + map.get(key));
	    }
	  }
}
