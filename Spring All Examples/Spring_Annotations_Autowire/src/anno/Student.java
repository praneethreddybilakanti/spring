package anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//File: Student.java
public class Student {
	private int sno;
	private String name;
	@Autowired
	@Qualifier("address1")
	private Address address;
	
	@Autowired
	public Student(Address address) {
		System.out.println("CONSTRCUTOR Injection");
		this.address = address;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
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
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setter Injection");
	}
}
