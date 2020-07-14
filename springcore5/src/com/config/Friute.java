package com.config;

import java.util.List;

public class Friute {

	private String name;
	private List friutes;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List getFriutes() {
		return friutes;
	}
	public void setFriutes(List friutes) {
		this.friutes = friutes;
	}
	@Override
	public String toString() {
		return "Friute [name=" + name + ", friutes=" + friutes + "]";
	}
}
