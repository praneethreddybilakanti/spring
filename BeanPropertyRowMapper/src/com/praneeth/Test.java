package com.praneeth;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
System.out.println("...................");
ApplicationContext context =new ClassPathXmlApplicationContext("resources/context.xml");

EmpDaoImpl ed=context.getBean(EmpDaoImpl.class);
List<Employee> l=ed.getAllEmployees();
System.out.println(l);

((AbstractApplicationContext) context).close();
}
}
