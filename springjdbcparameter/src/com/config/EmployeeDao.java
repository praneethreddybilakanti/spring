package com.config;

import org.springframework.jdbc.core.JdbcTemplate;

  

public class EmployeeDao {  
private JdbcTemplate jdbcTemplate;  
  
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
    this.jdbcTemplate = jdbcTemplate;  
}  
  
public int saveEmployee(Employee e){  
 String query="insert into employee values(?,?,?)"; 
 
    return jdbcTemplate.update(query,new Object[]
    		{
    				e.getId(),
    				e.getName(),
    				e.getSal()
    		});  
}  

  
}  