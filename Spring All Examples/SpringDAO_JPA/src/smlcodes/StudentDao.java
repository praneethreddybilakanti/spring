package smlcodes;

import java.util.List;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class StudentDao {
	JpaTemplate template;

	public void setTemplate(JpaTemplate template) {
		this.template = template;
	}

	public void saveStudent(int sno, String name, String address) {
		Student student = new Student(sno, name, address);
		template.persist(student);
	}

	public void updateStudent(int sno, String name) {
		Student student = template.find(Student.class, sno);
		if (student != null) {
			student.setName(name);
		}
		template.merge(student);
	}

	public void deleteStudent(int sno) {
		Student student = template.find(Student.class, sno);
		if (student != null)
			template.remove(student);
	}

	public List<Student> getAllStudents() {
		List<Student> students = template.find("select s from student s");
		return students;
	}
}