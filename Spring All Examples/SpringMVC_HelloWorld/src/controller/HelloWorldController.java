package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping("/helloController")
	public ModelAndView helloWorld() {
		String message = "Hello,Spring MVC!!!";
		return new ModelAndView("helloView", "message", message);
		//it will search for helloView.jsp in JSP Folder
	}
}
