package com.tns.day4;

public class MutiLinheritence 
{

	public static void main(String[]args) {
		
		City c = new City();
		c.setCapital("New Delhi");
		c.setCountryName("India");
		c.setCityName("Bangalore");
		c.setLanguage("hindi");
		c.setStateName("karnataka");
		c.setArea(124.0f);
		
		System.out.println(c);
	}
}
