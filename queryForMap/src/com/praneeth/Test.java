package com.praneeth;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
System.out.println("...................");
ApplicationContext ctx =new ClassPathXmlApplicationContext("resources/context.xml");
EmpDaoImpl ed=ctx.getBean(EmpDaoImpl.class);
Map m=ed.getAllEmployees();
System.out.println(m);
Map m1=ed.getIdEmployee(2);
System.out.println(m1);

	}
}
