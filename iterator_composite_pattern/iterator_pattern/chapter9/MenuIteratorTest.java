package com.designpattern.chapter9;

public class MenuIteratorTest {
	public static void main(String[] args) {
		KFCMenu k_menu = new KFCMenu();
		BJRoastDuckMenu bj_menu = new BJRoastDuckMenu();
		Waitreee waitreee = new Waitreee(k_menu, bj_menu);
		
		waitreee.printMenu();
	}
}
