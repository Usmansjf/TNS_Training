
package com.tns.day3;
import java.util.Scanner;

public class CustomerDemo {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("enter ID:");
		int id = sc.nextInt();

		System.out.println("enter name:");
		String name= sc.next();

		System.out.println("enter age:");
		int age = sc.nextInt();

		Customer obj = new Customer();

		obj.setCustomerId(id);
		obj.getCustomerId();
		obj.setCustomerName(name);
		obj.getCustomerName();
		obj.setAge(age);
		obj.getAge();


		System.out.println(obj);


	}

}
