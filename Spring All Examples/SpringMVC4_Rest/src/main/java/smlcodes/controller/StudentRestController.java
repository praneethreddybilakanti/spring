package smlcodes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import smlcodes.dao.StudentDAO;
import smlcodes.model.Student;

@RestController
public class StudentRestController {

	@Autowired
	private StudentDAO studentDAO;

	@GetMapping("/students")
	public List getStudents() {
		return studentDAO.list();
	}

	@GetMapping("/students/{sno}")
	public ResponseEntity getStudent(@PathVariable("sno") int sno) {
		Student student = studentDAO.get(sno);
		if (student == null) {
			return new ResponseEntity("No Student found for ID " + sno, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(student, HttpStatus.OK);
	}

	@PostMapping(value = "/students")
	public ResponseEntity createStudent(@RequestBody Student student) {
		studentDAO.create(student);
		return new ResponseEntity(student, HttpStatus.OK);
	}

	@DeleteMapping("/students/{sno}")
	public ResponseEntity deleteStudent(@PathVariable int sno) {
		if (studentDAO.delete(sno) == 0) {
			return new ResponseEntity("No Student found for ID " + sno, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(sno, HttpStatus.OK);
	}

	@PutMapping("/students/{sno}")
	public ResponseEntity updateStudent(@PathVariable int sno, @RequestBody Student student) {
		student = studentDAO.update(sno, student);
		if (null == student) {
			return new ResponseEntity("No Student found for ID " + sno, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(student, HttpStatus.OK);
	}

}