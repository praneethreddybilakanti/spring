import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

//file : BeforeAdviceEx.java
public class BeforeAdviceEx implements MethodBeforeAdvice {

	@Override
	public void before(Method m, Object[] args, Object target) throws Throwable {
	System.out.println("1.Before Adice : Executed ******");		
	}

}
