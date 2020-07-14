package com.praneeth;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		ApplicationContext ctx=new ClassPathXmlApplicationContext("resources/context.xml");
		/*
		 *Employee e=new Employee(); e.setEmpId(5); e.setEmpname("nagesh");
		 * 
		 * //EmpDaoImpl ed=ctx.getBean(EmpDaoImpl.class);
		 
		EmpserviceImp ed=ctx.getBean(EmpserviceImp.class);
		int i=ed.insert(e);
		
		System.out.println(i);
		*/
		EmpDaoImpl im=ctx.getBean(EmpDaoImpl.class);
		List l=im.getAllEmplyees();
		System.out.println(l);
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
	}
//		System.out.println(l);
}

}
