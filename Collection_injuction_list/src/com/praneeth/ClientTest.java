package com.praneeth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {

	public static void main(String[] args) {
		//Resource res=new ClassPathResource("resources/context.xml");
		ApplicationContext ctx=new ClassPathXmlApplicationContext("resources/context.xml");
			Student s=ctx.getBean(Student.class);
			System.out.println(s);
			s.display();
			((AbstractApplicationContext) ctx).close();
			}


		}