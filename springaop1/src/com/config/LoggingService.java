package com.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
@Aspect
public class LoggingService {
	@After("execution(* com.config.Employee.addEmployee())")
	public void logingMethod(JoinPoint jt)
	{
		System.out.println("loging method");
		System.out.println(jt.getSignature().getName());
	}

}
