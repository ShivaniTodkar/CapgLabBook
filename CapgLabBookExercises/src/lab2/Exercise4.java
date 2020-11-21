package lab2;

import java.util.Scanner;

public class Exercise4 
{
	static int size;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		size = modifyArray(array,size);  
        sc.close();
        for (int i=0; i<size; i++)  
           System.out.print(array[i]+" ");  
	}

	private static int modifyArray(int[] array,int size) 
	{
		if (size==0 || size==1){  
            return size;  
        }  
        int[] temp = new int[size];  
        int j = 0;  
        for (int i=0; i<size-1; i++){  
            if (array[i] != array[i+1]){  
                temp[j++] = array[i];  
            }  
         }  
        temp[j++] = array[size-1];     
        for (int i=0; i<j; i++){  
            array[i] = temp[i];  
        }  
        return j;  
		
	}

}
