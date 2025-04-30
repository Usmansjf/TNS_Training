package com.tns.day8;

public class MethodOverloadingDemo {

	
	public static void main(String[] args) {
		
		System.out.println("the no of two no's:" +MethodOverloading.addition(12, 20));
		
		System.out.println("the no of two no's:" +MethodOverloading.addition(12.2f, 20.4f));
		
		System.out.println("the no of three no's:" +MethodOverloading.addition(123, 204, 239));
		
		System.out.println("the no of two no's:" +MethodOverloading.addition(12.6f, 20));
		
		
		
		Point p;
		p =new Point();
		System.out.println(p);
		p = new Point(12.6f);
		System.out.println(p);
		p= new Point(12.6f,43.6f);
		System.out.println(p);
	}
}
