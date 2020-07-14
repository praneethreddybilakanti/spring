package com.config;

public class Item {

	private String name;
	private int qty;
	@Override
	public String toString() {
		return "Item [name=" + name + ", qty=" + qty + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
}
