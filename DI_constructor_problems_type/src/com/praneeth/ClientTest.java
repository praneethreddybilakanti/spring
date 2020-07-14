package com.praneeth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ClientTest {

	public static void main(String[] args) 
	{
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("resources/context.xml");
	
	Student s=ctx.getBean(Student.class);
	System.out.println(s);
	}
}
