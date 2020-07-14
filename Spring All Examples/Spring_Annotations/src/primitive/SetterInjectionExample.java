package primitive;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SetterInjectionExample {
public static void main(String[] args) {
	 Resource resource = new ClassPathResource("primitive/SpringConfig.xml");	 
	 BeanFactory factory = new XmlBeanFactory(resource);
	 
	 Object ob = factory.getBean("ob");
	 Student st = (Student) ob;
	 

	 
	 System.out.println(st.getSno());
	 System.out.println(st.getName());
	 System.out.println(st.getAddress());
}
}
