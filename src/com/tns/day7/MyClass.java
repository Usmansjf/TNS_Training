package com.tns.day7;

public class MyClass {

	
	private int section;
	private static int srNo;
	
	//static block
	
	static {
		System.out.println("im in static block");
		srNo=1000;
		//section=10;//in static block you can't declare non declare variables
	}
	
	//default constructor
	MyClass(){
		System.out.println("default");
		srNo++;
		section++;
	}

	@Override
	public String toString() {
		return "MyClass [srNo = " + srNo + "section = " + section + "]";
	}
	
	//static method
	
	static void display()
	{
		//System.out.println(section);//no access for non static variables
		System.out.println("serial no is " +srNo);
	}
}
