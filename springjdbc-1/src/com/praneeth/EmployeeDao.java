package com.praneeth;

import java.util.List;

public interface EmployeeDao {
	
int update(Employee e);
public int insert(Employee e);
public List getAllEmplyees();
}
