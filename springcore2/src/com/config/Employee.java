package com.config;

public class Employee {

	private int empno;
	private String name;
	Employee()
	{
		System.out.println("dc");
	}

	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + "]";
	}
}
