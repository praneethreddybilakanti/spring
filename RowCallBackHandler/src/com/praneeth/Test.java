package com.praneeth;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
System.out.println("...................");
ApplicationContext ctx =new ClassPathXmlApplicationContext("resources/context.xml");

EmpDaoImpl ed=ctx.getBean(EmpDaoImpl.class);
List l=ed.getAllEmployees();
System.out.println(l);
/*
	Employee e=ed.getIdEmployee(1);
	System.out.println(e.getId());
	System.out.println(e.getName());
	System.out.println(e.getSal());
*/

}
}
