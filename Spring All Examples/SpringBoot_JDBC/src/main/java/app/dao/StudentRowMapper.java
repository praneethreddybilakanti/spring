package app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import app.model.Student;

public class StudentRowMapper implements RowMapper<Student> {
	@Override
	public Student mapRow(ResultSet rs, int rowno) throws SQLException {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setSno(rs.getInt("sno"));
		s.setName(rs.getString("name"));
		s.setAddress(rs.getString("address"));
		return s;
	}
}
