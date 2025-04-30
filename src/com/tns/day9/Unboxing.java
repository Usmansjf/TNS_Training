package com.tns.day9;
import java.util.ArrayList;
//Wrapper Class - Conversion of Data type to object.
public class Unboxing
{

	public static void main(String[] args)
	{
		
		Character ch ='a';
		
		//Unboxing- Character object to primitive datatype
		char a=ch;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(24);
		
		int num=arrayList.get(0);
		System.out.println(arrayList.get(0));
	}
	
}
