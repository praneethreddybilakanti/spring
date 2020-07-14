package com.configindia.test;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.configindia.dao.EmployeeDao;
import com.configindia.model.Employee;
public class HelloClient {
	public static void main(String args[])
	{
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
    List<Employee> list=dao.geAllEmployees();  
          
    for(Employee e:list)  
        System.out.println(e);  
          
    }
}


