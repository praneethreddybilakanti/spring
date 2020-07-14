package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;
import app.entity.Student;
import app.repository.StudentRepository;
import javax.sql.DataSource;
import java.util.stream.Stream;

import static java.lang.System.exit;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	DataSource dataSource;

	@Autowired
	StudentRepository repository;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

	@Transactional(readOnly = true)
	@Override
	public void run(String... args) throws Exception {

		System.out.println("DATASOURCE = " + dataSource);

		System.out.println("\n1.findAll()...");
		for (Student student : repository.findAll()) {
			System.out.println(student);
		}

		System.out.println("\n2.findByName(String name)...");
		for (Student student : repository.findByName("Satya")) {
			System.out.println(student);
		}

		System.out.println("\n3.findByAddress(@Param(\"name\") String name)...");
		try (Stream<Student> stream = repository.findByAddress("Vijayawada")) {
			stream.forEach(x -> System.out.println(x));
			System.out.println("Done!");
			exit(0);
		}
	}

}