package jdbc;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//File : PreparedStmtTestApplication.java
public class PreparedStmtTestApplication {
	public static void main(String[] args) {
		Resource res = new ClassPathResource("jdbc/SpringConfig.xml");
		BeanFactory factory = new XmlBeanFactory(res);

		StudentPreparedStmntDao dao = (StudentPreparedStmntDao) factory.getBean("dao");
		//Student s = new Student(102, "Satya", "HYDERABAD");
		//boolean r = dao.saveStudentByPreparedStatement(s);
		//System.out.println(" Data Inserted : " + r);

		List<Student> list = dao.getAllstudents();
		for (Student e : list)
			System.out.println(e);
		}
}
