package anno;

 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 

//File : AutowireAnnotationExample.java
public class AutowireAnnotationExample {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("anno/SpringConfig.xml");
		Object ob = context.getBean("student");
		Student st = (Student) ob;
		Address addr = st.getAddress();
		
		System.out.println("Sno : "+st.getSno());
		System.out.println("Name : "+st.getName());
		System.out.println("Hno : "+addr.getHno());
		System.out.println("City : "+addr.getCity()); 
	}
}
