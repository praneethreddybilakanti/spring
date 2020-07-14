package jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

//File : StudentPreparedStmntDao.java
public class StudentPreparedStmntDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Boolean saveStudentByPreparedStatement(final Student s) {
		String query = "insert into student values(?,?,?)";
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {
			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {

				ps.setInt(1, s.getSno());
				ps.setString(2, s.getName());
				ps.setString(3, s.getAddress());
				return ps.execute();
			}
		});
	}

	public List<Student> getAllstudents() {
		return jdbcTemplate.query("select * from student", new ResultSetExtractor<List<Student>>() {
			@Override
			public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {

				List<Student> list = new ArrayList<Student>();
				while (rs.next()) {
					Student e = new Student();
					e.setSno(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setAddress(rs.getString(3));
					list.add(e);
				}
				return list;
			}
		});
	}
}