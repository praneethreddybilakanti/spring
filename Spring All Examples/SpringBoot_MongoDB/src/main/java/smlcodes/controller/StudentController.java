package smlcodes.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import smlcodes.repository.Student;
import smlcodes.repository.StudentRepository;
 
@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository;
	/**
	 * GET /create  --> Create a new student and save it in the database.
	 */
	@RequestMapping("/create")
	public Map<String, Object> create(Student student) {
		student = studentRepository.save(student);
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("message", "Student created successfully");
		dataMap.put("status", "1");
		dataMap.put("student", student);
	    return dataMap;
	}
	
	/**
	 * GET /read  --> Read a student by student id from the database.
	 */
	@RequestMapping("/read")
	public Map<String, Object> read(@RequestParam String name) {
		Student student = studentRepository.findByName(name);
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("message", "Student found successfully");
		dataMap.put("status", "1");
		dataMap.put("student", student);
	    return dataMap;
	}

	
	@RequestMapping("/readall")
	public Map<String, Object> readAll() {
		List<Student> students = studentRepository.findAll();
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("message", "Student found successfully");
		dataMap.put("totalStudent", students.size());
		dataMap.put("status", "1");
		dataMap.put("students", students);
	    return dataMap;
	}
}
