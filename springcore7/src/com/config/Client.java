package com.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
Friute ft=(Friute)ctx.getBean("f");
System.out.println(ft);
	}

}
