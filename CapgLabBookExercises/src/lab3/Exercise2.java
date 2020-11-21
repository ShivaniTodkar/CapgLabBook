package lab3;

import java.util.Scanner;


public class Exercise2 {
	
	
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String input=(scanner.nextLine());
		scanner.close();
		String output=getImage(input);

		System.out.println(output);
	}

	private static String getImage(String input) 
	{
		StringBuffer stringBuffer = new StringBuffer(input);
		stringBuffer.reverse();
	    String str = stringBuffer.toString();

		return str;
	}

}
