package com.tns.day8.Methodoverride;

public class OverridingDemo {
	public static void main(String[] args) {
	
		RBI rbi;
		rbi = new RBI();
		System.out.println(rbi);
		rbi = new HDFC();
		System.out.println(rbi);
		rbi = new ICICI();
		System.out.println(rbi);
		
}
}
