package config;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
Resource  rs=new ClassPathResource("spring.xml");
BeanFactory factory =new XmlBeanFactory(rs);
Object o=factory.getBean("tb");
TestBean t=(TestBean)o;
System.out.println(".........................");
t.show();

	}

}
