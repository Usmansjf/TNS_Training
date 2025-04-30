package com.tns.day5.firstpackage;

public class Base {
int defaultVar =10;
private int privateVar =20;
protected int protectedVar=30;
public int publicVar=40;



public int getPrivateVar() {
	return privateVar;
}

public void setPrivateVar(int privateVar) {
	this.privateVar = privateVar;
}



@Override
public String toString() {
	return "Base [privateVar=" + privateVar + "]";
}

void methodDefault() {
	System.out.println("im a default variable");
	System.out.println("access default :"+defaultVar);
}

public void methodPublic() {
	System.out.println("im a public variable");
	System.out.println("access :"+publicVar);
	
}
private void methodPrivate() {
	System.out.println("im private variable");
	System.out.println("access:"+privateVar);
}
protected void methodProtected() {
	System.out.println("im a protected variable");
	System.out.println("access:"+protectedVar);
}
}
