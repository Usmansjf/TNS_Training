package com.tns.day4;

public class Citizen {

	private String name;
	private String address;
	private int phno;
	private int age;
	
	
	public Citizen() {
		
		}


	public Citizen(String name, String address, int phno, int age) {
		this.name = name;
		this.address = address;
		this.phno = phno;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getPhno() {
		return phno;
	}


	public void setPhno(int phno) {
		this.phno = phno;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Citizen [name=" + name + ", address=" + address + ", phno=" + phno + ", age=" + age + "]";
	}
	
	
}
