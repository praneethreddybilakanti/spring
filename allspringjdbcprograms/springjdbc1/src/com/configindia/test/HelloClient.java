package com.configindia.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.configindia.dao.EmployeeDao;
import com.configindia.model.Employee;
public class HelloClient {
	public static void main(String[] args) {  
	    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
	      
	    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");

	    Employee e= new Employee();
	    e.setId(3);
	    e.setName("jam");
	    e.setSalary(777.76f);
	boolean b= dao.saveEmployeeByPreparedStatement(e);
	System.out.println(b);
	    
	}
}
