package com.praneeth;

public class Student {

	int id;
	String name;
	double marks;
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
	System.out.println("private constructor");	
	}
	public Student(int id,double marks) {
		this.id=id;
		this.marks=marks;
	System.out.println("marks constructor");	
	}
	
	public Student(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		
	}
	
	@Override
	public String toString() {
		return "Student [id is=" + id + ", name is=" + name + ", marks are=" + marks + "]";
	}
	
}
