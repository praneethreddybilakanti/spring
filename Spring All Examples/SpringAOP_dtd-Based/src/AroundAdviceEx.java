import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//file : AroundAdviceEx.java
public class AroundAdviceEx implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("3.AROUND ADVICE ======");
		Object obj;
		System.out.println("----Before Business logic");
		obj = mi.proceed();
		System.out.println("----After Business logic");
		return obj;
	}
}
