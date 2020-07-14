package com.config.model.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.config.model.Employee;

public class EmployeeDao {
private JdbcTemplate jt;
public void setJdbcTemplate(JdbcTemplate jt)
{
	this.jt=jt;
}
public void selectmethod()
{
	jt.execute("create table sptest(sno number(3), sname varchar(10))");
	// execute() returns void
	System.out.println("table created");

}




}
