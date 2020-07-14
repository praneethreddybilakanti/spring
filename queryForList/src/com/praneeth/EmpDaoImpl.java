package com.praneeth;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class EmpDaoImpl implements EmployeeDao {
private JdbcTemplate jt;
public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}
@Override
public List getAllEmployees() {
	return jt.queryForList("select *from employee");
}
@Override
public List<Map<String, Object>> getEmployee(int i,String name) {
	return jt.queryForList("select *from employee where empid=? and empname=?",new Object[] {i,name} );
}
}