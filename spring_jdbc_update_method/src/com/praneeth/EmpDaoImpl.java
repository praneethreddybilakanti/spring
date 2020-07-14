package com.praneeth;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoImpl  implements EmpDao {

	private JdbcTemplate jt;
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	@Override
	public int insert() {
		String sql="insert into emp values(?,?,?)";
int i=jt.update(sql,8,"ggg",600);
		
		
		return i;
	}

}
