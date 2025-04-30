package com.tns.day7.Final;

public class FinalMethodDemo extends FinalMethod{//to override methods we have to do inheritance

	
	void show() {//final prevents method override
		System.out.println("try to make a change"+ a);
	}
}



