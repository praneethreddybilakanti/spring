import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

//file : AfterAdviceEx.java
public class AfterAdviceEx implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("2. AFTER Advice Executed *****");
	}
}
