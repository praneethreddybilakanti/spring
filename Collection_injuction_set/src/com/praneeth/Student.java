package com.praneeth;
import java.util.Iterator;
import java.util.Set;

public class Student
{
private int id;
private Set courses;
public void setId(int id) {
	this.id = id;
}
public void setCourses(Set courses) {
	this.courses = courses;
}

@Override
public String toString() {
	return "Student [id=" + id + ", courses=" + courses + "]";
}

public void display()
{
	Iterator itr=courses.iterator();
	System.out.println("courses are:::");

	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
	
	
		
	
	
}