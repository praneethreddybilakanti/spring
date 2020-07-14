package com.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	Friute f=(Friute)context.getBean("f");
	System.out.println(f);
	}

}
