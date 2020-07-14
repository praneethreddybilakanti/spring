package autodetect_Not_Supporting;

//File: Student.java
public class Student {
	private int sno;
	private String name;
	private Address address;
	
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
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setter Injection");
	}


}
