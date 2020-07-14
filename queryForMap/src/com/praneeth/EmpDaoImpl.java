package com.praneeth;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
public class EmpDaoImpl implements EmpDao {
		
	private JdbcTemplate jt;
public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}
	@Override
	public Map getAllEmployees() {
		return jt.queryForMap("select *from employee where empid=1");
	}

	@Override
	public Map getIdEmployee(int id) {
		return jt.queryForMap("select empname from employee where empid=?",new Object[] {id});
	}

}
