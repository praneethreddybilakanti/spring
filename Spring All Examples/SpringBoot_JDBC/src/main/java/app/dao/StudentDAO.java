package app.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import app.model.Student;

@Repository
public class StudentDAO {

	@Autowired
	private JdbcTemplate template;

	public List<Student> findAll() {

		List<Student> result = template.query("SELECT sno,name, address FROM Student",
				(rs, rowNum) -> new Student(rs.getInt("sno"), rs.getString("name"), rs.getString("address")));
		return result;

	}

	public void addStudent(int sno, String name, String address) {
		template.update("INSERT INTO Student(sno,name, address) VALUES (?,?,?)", sno, name, address);
	}

	/*
	 * public List<Student> findAll() {
	 * 
	 * List<Student> result = template.query(
	 * "SELECT sno,name, address FROM Student", new StudentRowMapper()); return
	 * result;
	 * 
	 * }
	 * 
	 * public void addStudent(int sno, String name, String address) {
	 * template.update("INSERT INTO Student(sno,name, address) VALUES (?,?,?)",
	 * sno, name, address); }
	 */

}
