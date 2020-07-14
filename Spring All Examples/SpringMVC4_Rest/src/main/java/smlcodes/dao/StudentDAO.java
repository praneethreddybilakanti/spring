package smlcodes.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

import smlcodes.model.Student;

@Component
public class StudentDAO {

	// Dummy database. Initialize with some dummy values.
	private static List<Student> students;
	{
		students = new ArrayList();
		students.add(new Student(101, "Satya", "Hyderabad"));
		students.add(new Student(201, "Vijay", "Banglore"));
		students.add(new Student(301, "Rajesh", "Vijayawada"));
	}

	/**
	 * Returns list of students from dummy database.
	 * 
	 * @return list of students
	 */
	public List list() {
		return students;
	}

	/**
	 * Return student object for given sno from dummy database. If student is
	 * not found for sno, returns null.
	 * 
	 * @param sno
	 *            student sno
	 * @return student object for given sno
	 */
	public Student get(int sno) {

		for (Student c : students) {
			if (c.getSno()==sno) {
				return c;
			}
		}
		return null;
	}

	/**
	 * Create new student in dummy database. Updates the sno and insert new
	 * student in list.Random number between 0-1000
	 * 
	 * @param student
	 *            Student object
	 * @return student object with updated sno
	 */
	public Student create(Student student) {
		student.setSno(new Random().nextInt(1000));
		students.add(student);
		return student;
	}

	/**
	 * Delete the student object from dummy database. If student not found for
	 * given sno, returns null.
	 * 
	 * @param sno
	 *            the student sno
	 * @return sno of deleted student object
	 */
	public int delete(int sno) {

		for (Student c : students) {
			if (c.getSno()==sno) {
				students.remove(c);
				return sno;
			}
		}

		return 0;
	}

	/**
	 * Update the student object for given sno in dummy database. If student
	 * not exists, returns null
	 * 
	 * @param sno
	 * @param student
	 * @return student object with sno
	 */
	public Student update(int sno, Student student) {

		for (Student c : students) {
			if (c.getSno()==sno) {
				student.setSno(c.getSno());
				students.remove(c);
				students.add(student);
				return student;
			}
		}

		return null;
	}

}