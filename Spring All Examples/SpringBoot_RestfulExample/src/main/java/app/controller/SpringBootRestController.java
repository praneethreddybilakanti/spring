package app.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SpringBootRestController {

	@RequestMapping("/")
	public String welcome() {
		return "Spring Boot Home Page";
	}

	@RequestMapping("/hello")
	public String myData() {
		return "Smalcodes : Hello Spring Boot";
	}
}
