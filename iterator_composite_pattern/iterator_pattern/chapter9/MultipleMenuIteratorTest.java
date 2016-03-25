package com.designpattern.chapter9;

public class MultipleMenuIteratorTest {
	public static void main(String[] args) {
		KFCMenu k_menu = new KFCMenu();
		BJRoastDuckMenu bj_menu = new BJRoastDuckMenu();
		CafeMenu cafe_menu = new CafeMenu();
		Waitreee waitreee = new Waitreee(k_menu, bj_menu, cafe_menu);
		
		waitreee.printMenu();
	}
}
