package com.cg.training.lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.cg.training.lab6.service.PersonAge;

public class Exercise6Tester {
	
	private static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) 
	{
		Map<Integer,PersonAge> age1=new HashMap<>();
		List<Integer> id=voterList(age1);
		
		System.out.println("IDs of eligible persons :");
		for(Integer id1:id) {
			System.out.println(id1);
		}
	}
	
	private static List<Integer> voterList(Map<Integer, PersonAge> age) {
		age=new HashMap<>();
		List<Integer> list=new ArrayList<>();
		PersonAge ageObject=new PersonAge();
		int i=0;
		while(true) {
			 
			System.out.println("Enter the Id and Age of Person :");

			int id=scanner.nextInt();
			int person_age=scanner.nextInt();


			scanner.nextLine();
			
			ageObject.setId(id);
			ageObject.setAge(person_age);

			if(ageObject.getAge()>18) 
			{
				age.put(ageObject.getId(), ageObject);
			}

			System.out.println("Do you want to continue(yes/no)");
			String ch=scanner.nextLine();
			if(!ch.equalsIgnoreCase("y")) {
				break;
			}	
		}
		for(Map.Entry<Integer, PersonAge> l:age.entrySet()) {
			list.add(l.getKey());
		}
		return list;
	}

}
