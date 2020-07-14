package com.config.model.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.model.Employee;
import com.config.model.dao.EmployeeDao;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationcontext.xml");
EmployeeDao e=(EmployeeDao)ctx.getBean("edao");
Employee e1=new Employee();
System.out.println(e);
e.selectmethod();
	}

}
