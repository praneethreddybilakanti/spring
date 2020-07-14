package com.config;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	
	
	
private int rollno;
private String name;
private Address address;

/*** getters and setters
 */
public int getRollno() {
	return rollno;
}


public void setRollno(int rollno) {
	this.rollno = rollno;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public Address getAddress() {
	return address;
}

@Required
public void setAddress(Address address) {
	this.address = address;
}


	
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
}
	
}
