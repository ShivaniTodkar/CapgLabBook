package com.cg.training.lab6;

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {

	public static void main(String[] args) 
	{
		char array[]=new char[] {'A','S','D','Y','P','Y','S','O','K'};
		Map<Character,Integer> map=charCounts(array);
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			System.out.println("Character : "+ entry.getKey()+" Count : " + entry.getValue());
		}
	}
	static Map<Character,Integer> charCounts(char[] array)
	{
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		int length= array.length;
		for(int i=0;i<length;i++)
		{
			if(map.containsKey(array[i]))
			{
				int Count=map.get(array[i]);
				Count++;
				map.put(array[i], Count);
			}
			else
			{
				map.put(array[i], 1);
			}
		}
		return map;
		
	}
	
}
