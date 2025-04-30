package com.tns.day4;

public class HierarchicalDemo {

	public static void main(String []args) {
		
		
		//dynamic Binding: dynamic binding is  to print all child classes using parent class object only.
		
		Person p;
		
		p = new Person("usman","bangalore");
		
		p = new Student1("BE","chennai","pp",12.8f);
		System.out.println(p);
		p = new Employee("usman","bangalore",12,12.87f,"cs");
		System.out.println(p);
	}
}
