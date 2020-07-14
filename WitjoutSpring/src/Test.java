
public class Test {
public static void main(String[] args) {
	Employee e=new Employee();
	Address add =new Address();
	e.setEmpno(101);
	e.setName("praneeth");
	e.setAddress(add);
	add.setCity("hyd");
	add.setCountry("india");
	add.setState("telangana");
	System.out.println(e);
}
}
