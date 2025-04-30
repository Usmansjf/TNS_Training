package com.tns.day6.thirdpackage;

public class MyClass {

	private int id;
	
	public static MyClass obj = new MyClass();
	
	//private constructor
	
	private MyClass() {
		System.out.println("Im a Private Constructor");
	}
	

	
	//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static MyClass getObject() {//factory method
		return obj;
	}
	//toString
	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}	
}
