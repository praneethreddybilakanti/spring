package com.config;

public class Customer {

	private String name;
	private Item item;
	
	
	
	
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", item=" + item + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	
}
