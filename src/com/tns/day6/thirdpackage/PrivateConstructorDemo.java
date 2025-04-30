package com.tns.day6.thirdpackage;

public class PrivateConstructorDemo {

	public static void main(String[] args) {
		MyClass m = MyClass.getObject();
		m.setId(12);
		System.out.println(m);
	}
}
