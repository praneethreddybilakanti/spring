package com.praneeth;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("resources/context.xml");
		EmpDaoImpl re=ctx.getBean(EmpDaoImpl.class);
		System.out.println(re.getAllEmployees());
			List<?> l=	re.getAllEmployees();
			Iterator<?> itr= l.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
System.out.println(re.getEmployee(5,"nagesh"));
		}
}
