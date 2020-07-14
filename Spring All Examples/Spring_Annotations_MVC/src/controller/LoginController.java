package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("**************  Controller Enterd ************** ");
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		if (username.equals(password)) {
			System.out.println("**************  SUCCESS************** ");
			return new ModelAndView("successPage", "msg", "Login Success!!!");
		}

		else {
			System.out.println("**************  FAILED ************** ");
			return new ModelAndView("errorPage", "msg", "Login Failed!!!");
		}
	}

}
