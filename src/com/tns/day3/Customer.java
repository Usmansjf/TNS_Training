package com.tns.day3;

public class Customer {

	private int customerId;
	private String customerName;
	private int Age;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}



	public String toString() {
		return "Customer [customerId ="+customerId+",customerName ="+customerName+",age ="+Age+"]";
	}
}
