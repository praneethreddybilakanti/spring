package constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//File : ByNameExample.java
public class ConstructorExample {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("constructor/SpringConfig.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		Object ob = factory.getBean("student");
		Student st = (Student) ob;
		Address addr = st.getAddress();
		
		System.out.println("Sno : "+st.getSno());
		System.out.println("Name : "+st.getName());
		System.out.println("Hno : "+addr.getHno());
		System.out.println("City : "+addr.getCity()); 
	}
}
