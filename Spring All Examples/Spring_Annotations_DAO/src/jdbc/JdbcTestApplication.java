package jdbc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//File: JdbcTestApplication.java
public class JdbcTestApplication {
	public static void main(String[] args) {
		Resource res = new ClassPathResource("jdbc/SpringConfig.xml");
		BeanFactory factory = new XmlBeanFactory(res);

		System.out.println("1.INSERT \n ------------");
		StudentDao dao = (StudentDao) factory.getBean("dao");
		Student s = new Student(102, "Satya", "HYDERABAD");
		int r = dao.saveStudent(s);
		System.out.println(r + " Records are Effected");

		System.out.println(" \n 2.SELECT \n ------------");
		dao.selectStudents();

		System.out.println(" \n 3.UPDATE \n ------------");
		s.setName("RAVI");
		dao.updateStudent(s);
		dao.selectStudents();

		System.out.println(" \n 4.DELETE \n ------------");
		dao.deleteStudent(s);
		dao.selectStudents();
	}
}
