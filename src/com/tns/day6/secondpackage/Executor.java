package com.tns.day6.secondpackage;

import com.tns.day5.firstpackage.*;

public class Executor {

	public static void main(String[] args) {
		
		Base b1 = new Base();
//		b1.privateVar=20;
		b1.publicVar=30;
//		b1.defaultVar=40;
//		b1.protectedVar=50;
		
		
		b1.methodPublic();
//		b1.methodPrivate();
//		b1.methodProtected();
//		b1.methodDefault();
		
	}
}
