package com.configindia.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class LoggingAspect
{
	 @Before("execution(* com.configindia.service.EmployeeService.*(..))")
    public void logBefore(JoinPoint joinPoint)
    {

        System.out.print("logBefore() is running!");
        System.out.println(", before "
                + joinPoint.getSignature().getName() + " method");
        System.out.println("******");
    }

}
