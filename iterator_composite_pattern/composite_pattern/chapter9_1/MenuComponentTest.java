package com.designpattern.chapter9_1;

public class MenuComponentTest {
	public static void main(String[] args) {
		MenuComponent whole = new Menu("whole menus", "whole menus");
		MenuComponent KSCMenu = new Menu("开封菜", "开封菜");
		MenuComponent bjRoastDuckMenu = new Menu("北京烤鸭", "北京烤鸭");
		MenuComponent coffeeMenu = new Menu("coffee", "coffee");
		// 所有菜单汇总到一起
		whole.add(KSCMenu);
		whole.add(bjRoastDuckMenu);
		whole.add(coffeeMenu);
		
		// 添加开封菜子菜单
		KSCMenu.add(new MenuItem("hamburger", "hamburger", 2.00));
		KSCMenu.add(new MenuItem("salad", "salad", 3.00));
		KSCMenu.add(new MenuItem("french fries", "french fries", 4.00));
		KSCMenu.add(new MenuItem("chicken", "chicken", 6.00));

		// 添加北京烤鸭子菜单
		bjRoastDuckMenu.add(new MenuItem("北京烤鸭", "北京烤鸭", 22.00));
		bjRoastDuckMenu.add(new MenuItem("梅花扣肉", "salad", 23.00));
		bjRoastDuckMenu.add(new MenuItem("蚂蚁上树", "french fries", 104.00));
		bjRoastDuckMenu.add(new MenuItem("东坡肘子", "chicken", 236.00));
		
		// 添加咖啡 子菜单
		coffeeMenu.add(new MenuItem("Caramel cafe", "Caramel cafe", 2.00));
		coffeeMenu.add(new MenuItem("Mocha", "Mocha", 3.00));
		coffeeMenu.add(new MenuItem("black rose", "black rose ", 4.00));
		coffeeMenu.add(new MenuItem("irish iced coffee", "irish iced coffee", 6.00));
		
		// 咖啡馆里还有甜点子菜单(西式甜点)
		Menu westernDessert = new Menu("western dessert", "western dessert");		
		westernDessert.add(new MenuItem("Souffle","Souffle",6.88));
		westernDessert.add(new MenuItem("Butter Cookies","Butter Cookies", 5.91));
		// 咖啡馆里还有甜点子菜单(中式甜点)
		Menu chineseDessert = new Menu("中式甜点", "中式甜点");
		chineseDessert.add(new MenuItem("荷花酥", "荷花酥", 2.56));
		chineseDessert.add(new MenuItem("桂花糕", "桂花糕", 3.65));
		
		// 添加到咖啡馆菜单
		coffeeMenu.add(westernDessert);
		coffeeMenu.add(chineseDessert);
		
		Waitree waitree = new Waitree(whole);
		waitree.printMenu();
	}
}
