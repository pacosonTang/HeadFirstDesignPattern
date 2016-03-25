package com.designpattern.chapter9;

import java.util.ArrayList;
import java.util.Iterator;

public class KFCMenu implements Menu{
	ArrayList<MenuItem> items;
	
	public KFCMenu() {
		items = new ArrayList<>();
		addItem("hamburger", "hamburger", 2.00);
		addItem("salad", "salad", 3.00);
		addItem("french fries", "french fries", 4.00);
		addItem("chicken", "chicken", 6.00);
	}
	
	public void addItem(String name, String desc , double price) {
		MenuItem item = new MenuItem(name, desc, price);
		items.add(item);
	}
	
	public ArrayList getMenuItems() {
		return items;
	}
	
	@Override
	public Iterator<MenuItem> createIterator() {
		return items.iterator();
	}
}
