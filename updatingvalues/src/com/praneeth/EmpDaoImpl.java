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
	public int update(int e) {
String sql="update emp set sal=5000 where id=?";
int x=jt.update(sql,e);



return x;
	}

}
