package com.praneeth;

import java.util.Arrays;

public class Student {
private int id;
String[] name=new String[2];
public Student(int id, String[] name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "Student [id=" + id + ", address=" + Arrays.toString(name) + "]";
}
public void display()

{
	
	System.out.println("id of the student is:"+id+"name of the stdudent is:\n"+name[0]+"\n"+"address of the :"+name[0]+"is\n"+"location\n"+name[1]+"\n"+"state\n"+name[2]);
	
	
}
}
