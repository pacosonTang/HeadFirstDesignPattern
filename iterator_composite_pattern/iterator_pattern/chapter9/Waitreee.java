package com.designpattern.chapter9;

import java.util.Iterator;

public class Waitreee {
	private KFCMenu k_menu;
	private BJRoastDuckMenu bj_menu;
	private CafeMenu cafe_menu;
	
	public Waitreee(KFCMenu k_menu, BJRoastDuckMenu bj_menu, CafeMenu cafe_menu) {
		this.k_menu = k_menu;
		this.bj_menu = bj_menu;
		this.cafe_menu = cafe_menu;
	}
	
	public Waitreee(KFCMenu k_menu, BJRoastDuckMenu bj_menu) {
		this.k_menu = k_menu;
		this.bj_menu = bj_menu;
	}
	
	public void printMenu() {
		Iterator<MenuItem> k_iterator = k_menu.createIterator();
		Iterator<MenuItem> bj_iterator = bj_menu.createIterator();
		Iterator<MenuItem> cafe_iterator = cafe_menu.createIterator();
		
		System.out.println("====== 开封菜的菜品菜单 ======");
		printMenu(k_iterator);
		System.out.println("====== 北京烤鸭的菜品菜单 ======");
		printMenu(bj_iterator);
		System.out.println("====== 咖啡的菜品菜单 ======");
		printMenu(cafe_iterator);
	}
	
	private void printMenu(Iterator<MenuItem> iterator) {
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}



