package smlcodes;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class StudentJPAExample {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		StudentDao studentsDao = context.getBean("studentsDaoBean", StudentDao.class);

		studentsDao.saveStudent(101, "Satyar", "HYDERABAD");
		studentsDao.saveStudent(105, "RAJESH", "BANGLORE");
		System.out.println("Students created");

		studentsDao.updateStudent(105, "KARTHICK");
		System.out.println("Student Name updated");

		List<Student> students = studentsDao.getAllStudents();
		for (Student s : students) {
			System.out.println(s.getSno() + " : " + s.getName() + " , " + s.getAddress());
		}

		studentsDao.deleteStudent(111);
		System.out.println("Student deleted");

	}
}
