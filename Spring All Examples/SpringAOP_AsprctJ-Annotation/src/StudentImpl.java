
//file :StudentImpl.java
public class StudentImpl implements Student {

	@Override
	public void addStudent() {
		System.out.println("Satya : new Student Added");
	}

	@Override
	public String studentReturnValue() {
		return "Return Student: satya";
	}

	@Override
	public void studentThrowException() throws Exception {
		System.out.println("studentThrowException() is running ");
		throw new Exception("Student Error");

	}

	@Override
	public void studentAround(String name) {
		System.out.println("studentAround() is running, args : " + name);
	}

}