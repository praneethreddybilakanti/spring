
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

//File : StudentDao.java
public class StudentDao {
	private SimpleJdbcTemplate jdbcTemplate;
	public StudentDao(SimpleJdbcTemplate jdbcTemplate) {		
		this.jdbcTemplate = jdbcTemplate;
	}

	public int updateStudent(Student e) {
		String query = "update student set name=? where sno=?";
		return jdbcTemplate.update(query, e.getName(), e.getSno());
	}
}
