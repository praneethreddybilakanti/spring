package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class StudentController extends MultiActionController {
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return new ModelAndView("StudentPage", "msg", "addStudent() method");

	}

	public ModelAndView update(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return new ModelAndView("StudentPage", "msg", "updateStudent() method");

	}

	public ModelAndView delete(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return new ModelAndView("StudentPage", "msg", "deleteStudent() method");

	}

	public ModelAndView list(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return new ModelAndView("StudentPage", "msg", "listStudent() method");

	}
}
