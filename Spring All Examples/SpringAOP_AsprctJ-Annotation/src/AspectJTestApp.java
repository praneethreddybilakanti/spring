

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AspectJTestApp {
	public static void main(String[] args) throws Exception {

		 Resource res = new ClassPathResource("SpringConfig.xml");
	     BeanFactory factory = new XmlBeanFactory(res);
	     
		Student s = (Student) factory.getBean("studentOb");
		s.addStudent();
		s.studentReturnValue();
		s.studentAround("SATYA");
		s.studentThrowException();

	}
}