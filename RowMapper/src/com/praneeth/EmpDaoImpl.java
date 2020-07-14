package com.praneeth;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

public class EmpDaoImpl implements EmpDao {

	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public List getAllEmployees() {

		return jt.query("select * from emp",
				new RowMapper<Object>()
		{
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException
			{

				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSal(rs.getDouble(3));
	
			return e;
			
			//return rs.getInt(1)+rs.getString(2)+rs.getDouble(3);	
			
			
			}

		});
	}

	@Override
	public Employee getIdEmployee(int id) {
		Employee e = new Employee();

		List<?> l = jt.query("select id,name,sal from emp where id=?", 
				new Object[] { id },
				new RowMapper<Employee>()
		{

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException
			{
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSal(rs.getDouble(3));
				System.out.println(rowNum);
				return e;

			}
		}

		);
		return e;

	}
}