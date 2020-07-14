package com.praneeth;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientTest {

	public static void main(String[] args) {
		Resource res=new ClassPathResource("resources/context.xml");
		
		BeanFactory bf=new XmlBeanFactory(res);
//ApplicationContext ctx=new ClassPathXmlApplicationContext("resources/context.xml");
			Student s=bf.getBean(Student.class);
			System.out.println(s);
			s.display();
			//((AbstractApplicationContext) bf).close();
			}


}