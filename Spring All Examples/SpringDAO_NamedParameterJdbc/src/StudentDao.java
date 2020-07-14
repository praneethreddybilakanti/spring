
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import java.util.*;

public class StudentDao {
	private NamedParameterJdbcTemplate jdbcTemplate;

	public StudentDao(NamedParameterJdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public void saveStudent(Student e) {
		String query = "insert into Student values (:sno,:name,:address)";

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("sno", e.getSno());
		map.put("name", e.getName());
		map.put("address", e.getAddress());

		jdbcTemplate.execute(query, map, new PreparedStatementCallback() {
			@Override
			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				return ps.executeUpdate();
			}
		});
	}
}
