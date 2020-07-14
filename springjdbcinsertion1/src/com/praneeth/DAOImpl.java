package com.praneeth;

import org.springframework.jdbc.core.JdbcTemplate;

public class DAOImpl implements DAO {
private JdbcTemplate jt;
public void setTemp(JdbcTemplate temp) {
	this.jt = temp;
}
	
	
	
	@Override
	public int update(Employee e) {
		
		String sql="insert into emp values(1,'ddd',3000)";
		int t=jt.update(sql);
		return t;
	}

}
