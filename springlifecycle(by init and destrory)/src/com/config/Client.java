package com.config;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext("spring.xml");
			
		    	Student s = (Student)context.getBean("s");
		    	
		    	System.out.println(s);
		    	
		    	context.close();
	}

}
