package config;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		
		Resource res=new ClassPathResource("spring.xml");
		
	BeanFactory bf=new XmlBeanFactory(res);
	TestBean t=(TestBean)bf.getBean("tb");
	System.out.println(t.hashCode());
		
	TestBean t1=(TestBean)bf.getBean("tb");
	System.out.println(t1.hashCode());
		
		
		
		
		
		
		
		
		
/*	
 session
 prototype
 singleton
 request
 globalsesion
 	
 	
ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
TestBean t=(TestBean)ctx.getBean("tb");
System.out.println(".........................");
System.out.println(t.hashCode());

TestBean t1=(TestBean)ctx.getBean("tb");
System.out.println(".........................");
System.out.println(t1.hashCode());
t1.show();

t.show();
*/
	
	
	
	}

}
