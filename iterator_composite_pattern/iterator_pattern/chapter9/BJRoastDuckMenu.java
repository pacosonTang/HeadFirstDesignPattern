package com.designpattern.chapter9;

import java.util.Iterator;

public class BJRoastDuckMenu implements Menu{
	private final int MAX_ITEMS = 10;
	private int capacity = 0;
	MenuItem[] items;
	
	public BJRoastDuckMenu() {
		items = new MenuItem[MAX_ITEMS];
		addItem("������Ѽ", "������Ѽ", 22.00);
		addItem("÷������", "salad", 23.00);
		addItem("��������", "french fries", 104.00);
		addItem("��������", "chicken", 236.00);
	}
	
	public void addItem(String name, String desc , double price) {
		MenuItem item = new MenuItem(name, desc, price);
		if(capacity == MAX_ITEMS) {
			System.out.println("there's no space to store new obj");
		} else {
			items[capacity++] = item;
		}
	}
	
	public MenuItem[] getMenuItems() {
		return items;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	@Override
	public Iterator<MenuItem> createIterator() {
		return new BJRoastDuckMenuIterator(items);
	}
}
