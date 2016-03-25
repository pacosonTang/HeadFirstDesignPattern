package com.designpattern.chapter9_1;

public class MenuComponentTest {
	public static void main(String[] args) {
		MenuComponent whole = new Menu("whole menus", "whole menus");
		MenuComponent KSCMenu = new Menu("�����", "�����");
		MenuComponent bjRoastDuckMenu = new Menu("������Ѽ", "������Ѽ");
		MenuComponent coffeeMenu = new Menu("coffee", "coffee");
		// ���в˵����ܵ�һ��
		whole.add(KSCMenu);
		whole.add(bjRoastDuckMenu);
		whole.add(coffeeMenu);
		
		// ��ӿ�����Ӳ˵�
		KSCMenu.add(new MenuItem("hamburger", "hamburger", 2.00));
		KSCMenu.add(new MenuItem("salad", "salad", 3.00));
		KSCMenu.add(new MenuItem("french fries", "french fries", 4.00));
		KSCMenu.add(new MenuItem("chicken", "chicken", 6.00));

		// ��ӱ�����Ѽ�Ӳ˵�
		bjRoastDuckMenu.add(new MenuItem("������Ѽ", "������Ѽ", 22.00));
		bjRoastDuckMenu.add(new MenuItem("÷������", "salad", 23.00));
		bjRoastDuckMenu.add(new MenuItem("��������", "french fries", 104.00));
		bjRoastDuckMenu.add(new MenuItem("��������", "chicken", 236.00));
		
		// ��ӿ��� �Ӳ˵�
		coffeeMenu.add(new MenuItem("Caramel cafe", "Caramel cafe", 2.00));
		coffeeMenu.add(new MenuItem("Mocha", "Mocha", 3.00));
		coffeeMenu.add(new MenuItem("black rose", "black rose ", 4.00));
		coffeeMenu.add(new MenuItem("irish iced coffee", "irish iced coffee", 6.00));
		
		// ���ȹ��ﻹ������Ӳ˵�(��ʽ���)
		Menu westernDessert = new Menu("western dessert", "western dessert");		
		westernDessert.add(new MenuItem("Souffle","Souffle",6.88));
		westernDessert.add(new MenuItem("Butter Cookies","Butter Cookies", 5.91));
		// ���ȹ��ﻹ������Ӳ˵�(��ʽ���)
		Menu chineseDessert = new Menu("��ʽ���", "��ʽ���");
		chineseDessert.add(new MenuItem("�ɻ���", "�ɻ���", 2.56));
		chineseDessert.add(new MenuItem("�𻨸�", "�𻨸�", 3.65));
		
		// ��ӵ����ȹݲ˵�
		coffeeMenu.add(westernDessert);
		coffeeMenu.add(chineseDessert);
		
		Waitree waitree = new Waitree(whole);
		waitree.printMenu();
	}
}
