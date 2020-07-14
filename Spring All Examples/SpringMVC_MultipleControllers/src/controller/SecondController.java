package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//SecondController.java
@Controller
public class SecondController {
	@RequestMapping("/secondController")
	public ModelAndView firstMethod(){		
		return new ModelAndView("secondView","m2", "SECOND CONTROLLER MESSAGE");
	}	
}
