package jdbc;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveStudent(Student s) {
		String query = "insert into student values('" + s.getSno() + "','" + s.getName() + "','" + s.getAddress()
				+ "')";
		return jdbcTemplate.update(query);
	}

	public int updateStudent(Student s) {
		String query = "update student set name='" + s.getName() + "',address='" + s.getAddress() + "' where sno='"
				+ s.getSno() + "' ";
		return jdbcTemplate.update(query);
	}

	public int deleteStudent(Student s) {
		String query = "delete from student where sno='" + s.getSno() + "' ";
		return jdbcTemplate.update(query);
	}

	public void selectStudents() {
		List l = jdbcTemplate.queryForList("select * from student");
		Iterator it = l.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o.toString());
		}

	}

}
