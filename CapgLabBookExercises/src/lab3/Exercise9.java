package lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) 
	{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter date in yyyy-mm-dd :=");
				String day=sc.next();
				sc.close();
				 LocalDate pdate = LocalDate.parse(day);
				 
			        LocalDate now = LocalDate.now();
			 
			        Period diff = Period.between(pdate, now);
			 
			     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
			                    diff.getYears(), diff.getMonths(), diff.getDays());

		}

		
	}


