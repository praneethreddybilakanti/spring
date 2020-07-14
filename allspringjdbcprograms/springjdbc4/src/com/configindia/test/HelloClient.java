package com.configindia.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.configindia.dao.EmployeeDao;
import com.configindia.model.Employee;

public class HelloClient {
	public static void main(String args[])
	{
	  Resource r=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    EmployeeDao dao=(EmployeeDao)factory.getBean("edao");
	    Employee e= new Employee();
	    e.setId(101);
	    e.setName("config");
	    e.setSalary(5335.5f);
	    
	    dao.save(e);
	}
}
