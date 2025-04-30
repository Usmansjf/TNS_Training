package com.tns.day10;

public class MultiDimensionalArray
{
	
	static void pritArray(int a[][]) 
	{
		System.out.println("Array elements: ");
		for(int i=0;i<=a.length;i++) 
		{
			for(int j=0;j<=a.length;j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
