package com.praneeth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ClientTest {

	public static void main(String[] args) {
ApplicationContext ctx=new ClassPathXmlApplicationContext("resources/context.xml");
Student s1=ctx.getBean(Student.class);
	System.out.println(s1);
	System.out.println(s1.hashCode());
	System.out.println(s1.getClass());
 System.out.println(ctx.getBeanDefinitionCount());
	
 	String[] s=ctx.getAliases("student");
	for (String string : s) {
		System.out.println(string);
	}
	}

}
