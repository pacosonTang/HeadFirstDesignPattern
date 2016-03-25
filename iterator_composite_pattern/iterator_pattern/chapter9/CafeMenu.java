package com.designpattern.chapter9;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu{
	Hashtable<String, MenuItem> items;
	
	public CafeMenu() {
		items = new Hashtable<>();
		addItem("Caramel cafe", "Caramel cafe", 2.00);
		addItem("Mocha", "Mocha", 3.00);
		addItem("black rose", "black rose ", 4.00);
		addItem("irish iced coffee", "irish iced coffee", 6.00);
	}
	
	public void addItem(String name, String desc , double price) {
		MenuItem item = new MenuItem(name, desc, price);
		items.put(item.getName(), item);
	}
	
	@Override
	public Iterator<MenuItem> createIterator() {
		return items.values().iterator();
	}
}
