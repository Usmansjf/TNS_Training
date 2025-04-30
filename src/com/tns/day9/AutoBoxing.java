package com.tns.day9;
import java.util.ArrayList;
			//Wrapper Class - Conversion of Data type to object.
public class AutoBoxing
{
	public static void main(String[] args)
	{
		char ch = 'a';
		//Autoboxing - Primitive data types to character object
		
		Character a = ch;
		
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		
		//Autoboxing
		arraylist.add(25);
		
		System.out.println(arraylist.get(0));
		
	}
}
