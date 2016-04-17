package com.designpattern.chapter4_1;

public class PizzaTest {
	public static void main(String[] args) {
		PizzaStore store = new NewYorkPizzaStore();
		
		Pizza pizza = store.orderPizza("cheese");
	}
}
