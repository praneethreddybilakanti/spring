package smlcodes;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StudentHibernateExample {
	public static void main(String[] args) {

		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		StudentDao dao = (StudentDao) factory.getBean("d");

		Student e = new Student();
		e.setSno(147);
		e.setName("kumar");
		e.setAddress("Hyderabad");

		dao.saveEmployee(e);
		// dao.updateEmployee(e);
	}
}
