package com.configindia.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.configindia.service.EmployeeService;

public class HelloClient
{
public static void main(String[] args)
{
ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

System.out.println("---------------------------------------");
EmployeeService employeeService = context
                .getBean("employeeService", EmployeeService.class);
employeeService.addEmployee();
employeeService.modifyEmployee();
employeeService.deleteEmployee();
}
}




