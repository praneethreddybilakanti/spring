
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//File: JdbcTestApplication.java
public class JPATestApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		StudentDao dao = context.getBean("dao", StudentDao.class);

		dao.createStudent(201, "Rajesh", "BANGLORE");
		System.out.println("Accounts created");

	}
}
