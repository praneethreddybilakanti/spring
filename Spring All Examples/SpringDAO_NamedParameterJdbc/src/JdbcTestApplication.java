
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//File: JdbcTestApplication.java
public class JdbcTestApplication {
	public static void main(String[] args) {
		Resource res = new ClassPathResource("SpringConfig.xml");
		BeanFactory factory = new XmlBeanFactory(res);

		StudentDao dao = (StudentDao) factory.getBean("dao");
		Student s = new Student(103, "KAVETI", "HYDERABAD");
		dao.saveStudent(s);
	}
}
