package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string: ");
		String input=sc.nextLine();
		sc.close();
		if(isPositiveString(input))
		{
			System.out.println("Given string is a positive string");
		}else {
			
			System.out.println("Given string is not a positive string");
		}
	}

	private static boolean isPositiveString(String input) 
	{
		int n = input.length();  
        
        // create a character array of the length of the string  
        char c[] = new char [n];  
   
        for (int i = 0; i < n; i++) 
        {  
            c[i] = input.charAt(i);  
        }  
        
        // sort the character array  
        Arrays.sort(c);  
        
        // check if the character array  
        // is equal to the string or not  
        for (int i = 0; i < n; i++)  
            if (c[i] != input.charAt(i)) 
            	{
            		return false;
            	}
                
        return true;      
	}

}
