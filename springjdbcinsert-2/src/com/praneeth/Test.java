package com.praneeth;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		ApplicationContext ctx=new ClassPathXmlApplicationContext("resources/context.xml");
	EmpDaoImpl i=ctx.getBean(EmpDaoImpl.class);
	Employee e=new Employee();
	e.setName("fff");
	e.setId(6);
	e.setSal(500000);
	
				int l=i.insert(e);
	System.out.println(l);
	((AbstractApplicationContext) ctx).close();
		
	
	
	
	}}

