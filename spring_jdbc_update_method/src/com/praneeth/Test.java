package com.praneeth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/context.xml");

		EmpDaoImpl imp=context.getBean(EmpDaoImpl.class);
		int i=imp.insert();
		System.out.println(i);
((AbstractApplicationContext) context).close();		
	}
}
