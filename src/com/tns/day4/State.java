package com.tns.day4;

public class State extends Country
{
private String StateName;
private String Language;
public String getStateName() {
	return StateName;
}
public void setStateName(String stateName) {
	StateName = stateName;
}
public String getLanguage() {
	return Language;
}
public void setLanguage(String language) {
	Language = language;
}
@Override
public String toString() {
	return "State [StateName=" + StateName + ", Language=" + Language + ", getCountryName()=" + getCountryName()
			+ ", getCapital()=" + getCapital() + "]";
}


}
