package obj;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SetterObjectApp {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("obj/StudentConfig.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		Student student = (Student) factory.getBean("st");
		Address address = student.getAddress();
		System.out.println(student.getSno() + "," + student.getName());
		System.out.println(address.getHno() + "," + address.getCity());

	}
}
