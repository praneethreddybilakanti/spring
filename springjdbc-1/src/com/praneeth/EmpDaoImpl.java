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
	public int update(Employee e) {
		
		
		return 0;
	}

	@Override
	public int insert(Employee e) {
		String sql="insert into employee values(?,?)";
		int i=jt.update(sql,new Object[] {e.getEmpId(),e.getEmpname()});
		
		return i;
	}

	@Override
	public List getAllEmplyees() {
		
		return jt.query("select * from employee",new RowMapper<Employee>(){  
		    @Override  
		    public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {  
		    	
		    	
		        Employee e=new Employee();  
		        e.setEmpId(rs.getInt(1));  
		        e.setEmpname(rs.getString(2));  
		    	
return e;		    	
		    }  
		    });  
		}  }
