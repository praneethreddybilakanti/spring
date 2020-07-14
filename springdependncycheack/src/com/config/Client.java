package com.config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Client {

	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Student s=(Student)ctx.getBean("student");
		System.out.println(s);
		System.out.println(s.hashCode());

		Student s1=(Student)ctx.getBean("student");
		System.out.println(s1);
		System.out.println(s1.hashCode());

		
	}

}
