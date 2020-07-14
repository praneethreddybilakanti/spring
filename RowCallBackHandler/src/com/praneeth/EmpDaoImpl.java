package com.praneeth;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class EmpDaoImpl  implements EmpDao {
private JdbcTemplate jt;
public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}

	

	@Override
	public List getAllEmployees() {

		 
				List<Employee> l=new ArrayList<>();
						jt.query("select id, name,sal from emp",
				new RowCallbackHandler()
				{
							Employee e=new Employee();
					@Override
					public void processRow(ResultSet rs) throws SQLException
					{
						e.setId(rs.getInt(1));
						e.setName(rs.getString(2));
						e.setSal(rs.getDouble(3));
					l.add(e);	
					}
			
				});
				return l;
}

	@Override
	public Employee getIdEmployee(int id) {
				return null;

	}
}