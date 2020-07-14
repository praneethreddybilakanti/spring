package com.praneeth;

import java.util.ArrayList;
import java.util.List;

public class Student
{
private int id;
private List details=new ArrayList<>();
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public List getDetails() {
	return details;
}
public void setDetails(List details) {
	this.details = details;
}
@Override
public String toString() {
	return "Student [id=" + id + ", details=" + details + "]";
}
public void display()
{
	System.out.println("student name is:\t"+details.get(0));
	System.out.println("id of the student is:\t"+id);
System.out.println("student state:\t"+details.get(1));
System.out.println("city of the :\t"+details.get(0)+"\t:is\t"+details.get(2));
}
	
	
		
	
	
}