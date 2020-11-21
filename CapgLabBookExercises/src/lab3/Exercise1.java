package lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers in a line with space:");
        String integers = sc.nextLine();
        
        //StringTokenizer Class
        StringTokenizer stringTokenizer = new StringTokenizer(integers, " ");
        
        
        System.out.println("Displaying each integer...");
        while (stringTokenizer.hasMoreTokens()) 
        {
            String temp = stringTokenizer.nextToken();
            int newInteger = Integer.parseInt(temp);
            
            System.out.println(newInteger);
            sum = sum + newInteger;
        }
        System.out.println("Sum of all the integers is: " + sum);
        sc.close();
		
	}

}
