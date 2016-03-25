package com.designpattern.chapter9_2;

import java.util.Iterator;

public class Waitree {
	MenuComponent all_menus;
	
	public Waitree(MenuComponent all_menus) {
		this.all_menus = all_menus;
	}
	
	public void printMenu() {
		all_menus.print();
	}
	
	public void printPriceLessThanSix() {
		Iterator iterator = all_menus.createIterator();
		System.out.println("the menuitem list whose price is less than 6");
		while(iterator.hasNext()) {
			MenuComponent component = (MenuComponent) iterator.next();
			try {
				if(component instanceof MenuItem && component.getPrice() < 6) {
					component.print();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
