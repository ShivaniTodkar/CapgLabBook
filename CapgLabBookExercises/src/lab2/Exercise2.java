package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("Enter the total number of string object: ");
		// accept the no of string object
				int size=scanner.nextInt();
				scanner.nextLine();
				
				//allocate memory
				String array[]=new String[size];
				
				//Enter the object in a string array

				System.out.println("Enter string objects:");
				for (int i = 0; i < array.length; i++) {
					array[i]=scanner.nextLine();
				}
				
				sortStrings(array);
				scanner.close();


			}
	
			private static String sortStrings(String a[]) 
			{
				
				int mid=0;
				Arrays.sort(a);
				if(a.length%2==0)
					{
						mid=a.length/2;
					}
				else
				{
					mid=(a.length/2)+1;
				}
				
				for (int j = 0; j < a.length; j++) 
				{
					
					if(j<mid)
						System.out.println(a[j].toUpperCase());
					else
						System.out.println(a[j].toLowerCase());
					
				}
				return null;
					
				}
	
}


