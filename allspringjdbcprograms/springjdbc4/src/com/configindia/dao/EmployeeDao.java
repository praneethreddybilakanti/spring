package com.configindia.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.configindia.model.Employee;

public class EmployeeDao {
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;  
	  
	
	
	
	public EmployeeDao(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
	
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}




	public  void save(Employee e){  
	String query="insert into employee values (:id,:name,:salary)";  
	  
	Map<String,Object> map=new HashMap<String,Object>();  
	map.put("id",e.getId());  
	map.put("name",e.getName());  
	map.put("salary",e.getSalary());  
	  
	namedParameterJdbcTemplate.execute(query,map,new PreparedStatementCallback<Object>() {  
	    @Override  
	    public Object doInPreparedStatement(PreparedStatement ps)  
	            throws SQLException, DataAccessException {  
	        return ps.executeUpdate();  
	    }  
	});  
}
}
