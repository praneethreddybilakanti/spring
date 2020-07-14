package com.config;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class client {

	public static void main(String[] args) {
//ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Resource rs=new ClassPathResource("spring.xml");
		BeanFactory bf=new XmlBeanFactory(rs);
	Friute f=(Friute)bf.getBean("f");
	System.out.println(f);
	}

}
