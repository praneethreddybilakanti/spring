package com.config.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.config.Employee;

public class Demo {

	public static void main(String[] args) {

		Resource rs= new ClassPathResource("spring.xml");
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		BeanFactory factory=new XmlBeanFactory(rs);
		Object o=factory.getBean("emp");
		Employee employee=(Employee)o;
		System.out.println("object is created");
		System.out.println(employee);
		System.out.println("alias names");
		String an[]=factory.getAliases("emp");
		for(String s:an)
		{
			System.out.println(s);
		}
		
		System.out.println("contains"+"\t"+factory.containsBean("emp"));
		System.out.println("contains"+"\t"+factory.containsBean("emp1"));
		System.out.println("class name"+"\t"+factory.getType("emp"));
		System.out.println("class name"+"\t"+factory.getType("emp").getName());
		System.out.println(factory.hashCode());
		//System.out.println(((Employee) factory).getName());

		
	}
		
		
		
	}


