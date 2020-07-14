package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//FirstController.java
@Controller
public class FirstController {
	@RequestMapping("/firstController")
	public ModelAndView firstMethod(){		
		return new ModelAndView("firstView","m1", "FIRST CONTROLLER MESSAGE");
	}	
}
