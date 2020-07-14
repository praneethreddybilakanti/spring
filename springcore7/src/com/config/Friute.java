package com.config;

import java.util.List;

public class Friute {
private String cname;
private List<String> flaver;

@Override
public String toString() {
	return "Friuteclass [cname=" + cname + ", flaver=" + flaver + "]";
}
public Friute(String cname, List flaver) {
	this.cname = cname;
	this.flaver = flaver;
}

}
