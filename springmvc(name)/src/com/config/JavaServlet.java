package com.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JavaServlet {
@RequestMapping("/test")
	public ModelAndView m1()
	{
		String name="BILAKANTI PRANEETH KUMAR REDDY";
		
		return new ModelAndView("welcome","x",name);
	}
}
