package com.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationcontext.xml");
	
	Employee e= (Employee)ctx.getBean("employeeService");
	
	e.addEmployee();}

}
