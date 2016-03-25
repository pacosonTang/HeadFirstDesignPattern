package com.designpattern.chapter9_1;

public class Waitree {
	MenuComponent all_menus;
	
	public Waitree(MenuComponent all_menus) {
		this.all_menus = all_menus;
	}
	
	public void printMenu() {
		all_menus.print();
	}
}
