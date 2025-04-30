package com.tns.day10;

import java.util.Arrays;

public class ArrayDemo 
{
	public static void main(String[] args)
	{
		int array[]= {10,20,30,40,50};
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(array[i]);
		}
		
		System.out.println("Array is:"+Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println("Sorted array: "+Arrays.toString(array));
		
		int key = 40;
		System.out.println(key+" Found at index: "+Arrays.binarySearch(array, key));
		
		System.out.println(key +"Found at index: "+Arrays.binarySearch(array, 1, 3, key));
		
		int array2[]= {10,20,30,40,50};
		System.out.println("Second array: "+Arrays.toString(array2));
		
		//to compare 2 arrays
		
		if(Arrays.equals(array, array2)) 
		{
			System.out.println("Both arrays are same");
		}
		else 
		{
			System.out.println("Both arrays are different");
		}
	}
}
