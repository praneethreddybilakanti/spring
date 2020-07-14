package app.controller;

import org.springframework.web.bind.annotation.RestController;

import app.dao.StudentDAO;
import app.model.Student;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class SpringBootJDBCController {

	@Autowired
	private StudentDAO dao;

	@RequestMapping("/jdbc")
	public String welcome() {
		return "Spring Boot Home Page";
	}

	@RequestMapping("/insert")
	public String insert(@RequestParam("sno") int sno, @RequestParam("name") String name,
			@RequestParam("address") String adr) {
		System.out.println(" ************** Inside Method ************");

		dao.addStudent(sno, name, adr);
		return "Data Inserted";
	}

	@RequestMapping("/select")
	public String select() {
		
		String result="";
		
		List<Student> list = dao.findAll();
		Iterator<Student> itr = list.iterator();
		while (itr.hasNext()) {
			Student s = (Student) itr.next();
			result = result+ s.getSno()+", ";
			result = result+ s.getName()+", ";
			result = result+ s.getAddress()+" <br>";
		}
		System.out.println("Result : "+result);
		return result;
	}
}
