package com.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class LoggingService {
	@Before("execution(* com.config.Employee.addEmployee())")
	public void logingMethod(JoinPoint jt)
	{
		System.out.println("loging method");
		System.out.println("method signuture"+"\t"+jt.getSignature().getName());
	}

}
