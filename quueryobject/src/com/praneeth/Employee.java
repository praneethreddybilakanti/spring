package com.praneeth;

public class Employee {
private int  empId;
private String empname;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empname=" + empname + "]";
}

}
