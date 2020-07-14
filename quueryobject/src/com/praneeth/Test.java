package com.praneeth;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	

		ApplicationContext ctx=new ClassPathXmlApplicationContext("resources/context.xml");
		EmpDaoImpl re=ctx.getBean(EmpDaoImpl.class);
		re.retrive();
		String s=re.getName(1);
		System.out.println(s);
String name=re.getEmployee(1);
System.out.println(name);
}
}
