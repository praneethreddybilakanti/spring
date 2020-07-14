package com.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JavaController {
@RequestMapping("/test")
	public ModelAndView service() {
		String s="helloworld";
		
		
	return new ModelAndView("welcome","message",s);
	
		
	}
}
