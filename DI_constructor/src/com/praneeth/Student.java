package com.praneeth;

public class Student {

	int id;
	String name;
	double marks;
	public Student() {
	System.out.println("private constructor");	
	}
	
	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		
	}
	
	@Override
	public String toString() {
		return "Student [id is=" + id + ", name is=" + name + ", marks are=" + marks + "]";
	}
	
}
