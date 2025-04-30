package com.tns.day4;

public class Person {
	private String Name;
	private String City;
	
	

	public Person(String name, String city) {
		super();
		Name = name;
		City = city;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", City=" + City + "]";
	}



}
