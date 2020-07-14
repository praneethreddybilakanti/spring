



public class Employee {
private int empno;
private String name;
private Address address;
@Override
public String toString() {
	return "Employee [empno=" + empno + ", name=" + name + ", address=" + address + "]";
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
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
}
