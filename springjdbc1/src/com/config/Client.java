
package com.config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");  
	      
	    EmployeeDao dao=(EmployeeDao)ctx.getBean("e");
/*
	    Employee e= new Employee();
	    e.setId(1);
	    e.setName("ram");
	    e.setSal(564.76f);
	int status= dao.saveEmployee(e);
	System.out.println(e);
	System.out.println("inserted"+"\t"+status);
	*/
	System.out.println("..........................");
	Employee e1=new Employee();
	e1.setName("ks reddy");
	e1.setSal(30000l);
e1.setId(1);
	System.out.println(e1);
int update=dao.updateEmployee(e1);
	System.out.println("updated"+update);

	}
}