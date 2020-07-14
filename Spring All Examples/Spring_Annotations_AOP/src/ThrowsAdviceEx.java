
import org.springframework.aop.ThrowsAdvice;
//file : ThrowsAdviceEx.java
public class ThrowsAdviceEx implements ThrowsAdvice {
	public void afterThrowing(java.lang.ArithmeticException ex){  
        System.out.println("4.ThrowsAdvice : Error Occured!!!");  
    }   
}
