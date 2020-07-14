package com.praneeth;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Student
{
private String sname;
private Properties propt;



public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public Properties getPropt() {
	return propt;
}


public void setPropt(Properties propt) {
	this.propt = propt;
}



@Override
public String toString() {
	return "Student [sname=" + sname + ", propt=" + propt + "]";
}

public void display()
{
	
Set s=propt.entrySet();	
System.out.println(sname +":prop are:--------------");	
			Iterator itr=s.iterator();
			System.out.println("prop:\tvalues names");
			System.out.println("....................");
	Map.Entry s1 = null,s2 = null,s3 = null,s4 = null;
			while(itr.hasNext())
	{
		
		s1=(Entry) itr.next();
		System.out.println(s1.getKey()+":::::\t"+s1.getValue());
		
	
	}
			
	}
	


}