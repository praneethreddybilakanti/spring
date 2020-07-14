package com.praneeth;

import java.util.List;
import java.util.Map;

public interface EmployeeDao {
	
	public List getAllEmployees();

	public List<Map<String,Object>> getEmployee(int i,String name);
}
