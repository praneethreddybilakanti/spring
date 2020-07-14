package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import model.Student;

@Controller

public class StudentController {
	@RequestMapping(value="/student")
	public ModelAndView getStudent(Student student) {
		return new ModelAndView("addPage", "msg", "Student Added");
	}
}
