package com.praneeth;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class EmpDaoImpl extends JdbcDaoSupport implements EmpDao {
	

	@Override
	public List<Employee> getAllEmployees() {
		return getJdbcTemplate().query("select id, name,sal from emp", new BeanPropertyRowMapper<Employee>(Employee.class));

	}

	@Override
	public Employee getIdEmployee(int id) {
		return null;

	}
}