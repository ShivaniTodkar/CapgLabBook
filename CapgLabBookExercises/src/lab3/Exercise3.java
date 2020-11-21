package lab3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input=scanner.nextLine();
		String output=alterString(input);
		scanner.close();
		System.out.println(output);
	}

	static boolean isVowel(char ch) 
    { 
        if (ch != 'a' && ch != 'e' && ch != 'i'
                && ch != 'o' && ch != 'u')  
        { 
            return false; 
        } 
        return true; 
    } 
	
	private static String alterString(String input) 
	{
		char[] s=input.toCharArray();
		for (int i = 0; i < s.length; i++) 
        { 
            if (!isVowel(s[i])) 
            { 
                // if character is z, than replace it with character b 
                if (s[i] == 'z')  
                { 
                    s[i] = 'b'; 
                } 
                  
                // if the alphabet is not z 
                else
                { 
                    // replace the element with 
                    // next immediate alphabet 
                    s[i] = (char) (s[i] + 1); 
  
                    // if next immediate alphabet is vowel, 
                    // than take next 2nd immediate alphabet 
                    if (isVowel(s[i]))  
                    { 
                        s[i] = (char) (s[i] + 1); 
                    } 
                } 
            } 
        } 
        return String.valueOf(s); 
		
	}

}
