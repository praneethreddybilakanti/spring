package com.config;

import java.util.List;

public class Friute {

	private String name;
	private List <String>friutes;
	
	
	public Friute(String name, List friutes) {
		this.name = name;
		this.friutes = friutes;
	}


	@Override
	public String toString() {
		return "Friute [name=" + name + ", friutes=" + friutes + "]";
	}
}
