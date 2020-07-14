package com.config;

public class FriuteFlaver {
private String name;
private String color;

@Override
public String toString() {
	return "Friute [name=" + name + ", color=" + color + "]";
}
public FriuteFlaver(String name, String color) {
	this.name = name;
	this.color = color;
}

}
