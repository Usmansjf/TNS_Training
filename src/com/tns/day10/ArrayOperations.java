package com.tns.day10;

public class ArrayOperations 
{
	//print array
	static void printArray(int [] arr) 
	{
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]+"\t");		
		}
		System.out.println();
	}
	
	
	//count no. of odd elements
		public static int getOddCount(int o[])
		{
			int count=0;
			for(int i=0;i<o.length;i++) 
			{
				if(o[i]%2!=0)
					count++;
			}
			return count;
		}
		
		int[] arr;
		int arr1[];

}
