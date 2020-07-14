package com.praneeth;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmpDaoImpl implements EmpDao {

	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return (List<Employee>) jt.query("select id,name,sal from emp", new ResultSetExtractor<List<Employee>>() {
			List<Employee> l = new ArrayList<>();

			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {

				Employee e = null;
				while (rs.next()) {
					e = new Employee();
					e.setId(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setSal(rs.getDouble(3));
					l.add(e);
				}
				return l;
			}

		});
	}

	@Override
	public Employee getIdEmployee(int id) {

		Employee e = new Employee();

		jt.query("select id,name,sal from emp where id=?", new ResultSetExtractor<Employee>() {
			public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {

				while (rs.next()) {

					e.setId(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setSal(rs.getDouble(3));
				}
				return e;
			}
		}, new Object[] { id });

		return e;
	}

}
