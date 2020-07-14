package com.praneeth;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
public void retrive() {
String i=jt.queryForObject("select empname from employee where empid=1",String.class);
System.out.println(i);
}
@Override
public String getName(int id) {

	return jt.queryForObject("select empname from employee where empid="+id,String.class);
}
@Override
public String getEmployee(int eno) {
	return jt.queryForObject("select empname from employee where empid=?",String.class, new Object[] {eno});
}
}
	