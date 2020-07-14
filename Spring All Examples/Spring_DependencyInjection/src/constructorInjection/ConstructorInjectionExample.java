package constructorInjection;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//File : ConstructorInjectionExample.java
public class ConstructorInjectionExample {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("constructorInjection/SpringConfig.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		Object ob = factory.getBean("ob");
		Country c = (Country) ob;
		c.getCountry();
	}
}
