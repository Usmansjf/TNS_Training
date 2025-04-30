package com.tns.day7.Final;

public abstract class VariableFinal {

	
	final int x=100;//should give value during declaration only
	final static int y;//blank final static not possible 
	final static int z=10; //declaration
	
	void change(){
		x=30;
		y=200;
	}

	@Override
	public String toString() {
		return "VariableFinal [x = " + x + ", y = " + y +", z = " + z + "]";
	}
	
	static {
		y=20;
		z=35;//re- initialization is not possible
		System.out.println(y);
	}
	
}
