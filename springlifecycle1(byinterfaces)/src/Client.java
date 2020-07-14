import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		//ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		//AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");

		
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		
		Student s=(Student)ctx.getBean("s");
		
		System.out.println(s);
		//ctx.registerShutdownHook();
		ctx.close();
	
	}

}
