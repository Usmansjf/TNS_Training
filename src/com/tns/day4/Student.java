package com.tns.day4;

public class Student extends Citizen{

	private int rollno;
	private String collegeName;
	
	
//	public Student()
//	{
//		super();
//	}


	public Student(String name, String address, int phno, int age, int rollno, String collegeName) {
		super(name, address, phno, age);
		this.rollno=rollno;
		this.collegeName=collegeName;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getCollegeName() {
		return collegeName;
	}


	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAddress()=" + getAddress() + ", getPhno()=" + getPhno() + ", getAge()=" + getAge() + "]";
	}
	
	
}
