package com.praneeth;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;

public class Student
{
private String name;
private Map courses;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Map getCourses() {
	return courses;
}

public void setCourses(Map courses) {
	this.courses = courses;
}

@Override
public String toString() {
	return "Student [name=" + name + ", courses=" + courses + "]";
}
public void display()
{
	
Set s=courses.entrySet();	
System.out.println(name +":courses are:--------------");	
			Iterator itr=s.iterator();
			System.out.println("numbers:\tcourses names");
			System.out.println("....................");
	while(itr.hasNext())
	{
		Map.Entry s1=(Entry) itr.next();
		System.out.println(s1.getKey()+"\t---\t"+s1.getValue());
	}
}

}