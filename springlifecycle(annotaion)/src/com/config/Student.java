package com.config;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
@PostConstruct
	public void initIt() {
	  System.out.println("Init method after properties are set : " + message);
	}
	@PreDestroy
	public void cleanUp() throws Exception {
	  System.out.println("Spring Container is destroy! Customer clean up");
	}
}
