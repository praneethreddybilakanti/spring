package com.praneeth;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

public class EmpDaoImpl implements EmployeeDao {
private JdbcTemplate jt;
public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}
	@Override
	public int update(Employee e) {
		
		
		return 0;
	}

	@Override
	public int insert( Employee e) {
				String sql="insert into emp values(?,?,?)";
		int x=jt.update(sql,new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
ps.setInt(1, e.getId());
ps.setString(2,e.getName());
ps.setDouble(3, e.getSal());
			}
		});
		
		return x;
	}
}

	
