package com.tns.day8.Methodoverride;
//super class
public class RBI {

	 public float getRateOfInterest() {
		 return 6.7f;
	 }

	@Override
	public String toString() {
		return "RBI [getRateOfInterest()=" + getRateOfInterest() + "]";
	}
	 
	 
}
