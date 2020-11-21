package lab2;

//import java.util.Arrays;	//remove comment while using alternative option
import java.util.Scanner;

public class Exercise1 {

	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		sc.close();
		int secondSmallest=getSecondSmallest(array,size);
		System.out.println("The second last element is "+secondSmallest);
	}	
	private static int getSecondSmallest(int[] array,int size) 
	{
		int temp;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
			if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
	
				}
			}
		}
			return array[1];
		
	}

	
	
	
	//ALTERNATE METHOD
	
//	private static int getSecondSmallest(int[] array,int size) {
//		
//		Arrays.parallelSort(array);
//		return array[1];
//	}

}
