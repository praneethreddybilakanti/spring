package com.praneeth;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		System.out.println("...................");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("resources/context.xml");
		DAOImpl ed = ctx.getBean(DAOImpl.class);
		System.out.println(ed);
	}
}
