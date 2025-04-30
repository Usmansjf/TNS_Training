package com.tns.day6.staticandfinal;

public class Employee {
	
	private int id;
	private String name;
	
	
	static String CompanyName = "TNS";


	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [id = " + id + ", name = " + name + ", Company Name = " + CompanyName + "]";
	}
	
	

}
