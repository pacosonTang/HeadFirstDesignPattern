package com.designpattern.chapter9_1;

// ²Ëµ¥Ïî
public class MenuItem extends MenuComponent{
	private String name;
	private String desc;
	private double price;
	
	public MenuItem() {}
	
	public MenuItem(String name, String desc, double price) {
		this.name = name;
		this.desc = desc;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "name=" + name + ", price=" + price;
	}
	
	public void print() {
		System.out.println(this);
	}
}
