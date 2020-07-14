package com.config;

public class Employee {
private int eno;
private String name;
private Address address;
public Employee(int eno, String name, Address address) {
	super();
	this.eno = eno;
	this.name = name;
	this.address = address;
}
@Override
public String toString() {
	return "Employee [eno=" + eno + ", name=" + name + ", address=" + address + "]";
}


}
