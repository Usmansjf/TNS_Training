package com.tns.day5.firstpackage;

public class Executor {

	public static void main(String[] args) {
		
		Base b1 = new Base();//created object for base class
//		b1.privateVar=21;
		b1.defaultVar=30;
		b1.protectedVar=40;
		b1.publicVar=51;
		
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
//		b1.methodPrivate();
		
	}
}
