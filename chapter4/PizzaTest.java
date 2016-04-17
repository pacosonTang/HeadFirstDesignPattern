package com.designpattern.chapter4;

public class PizzaTest {
	public static void main(String[] args) {
		PizzaStore nyStore = new NewYorkPizzaStore();
		PizzaStore bjStore = new BeiJingPizzaStore();
		
		// ¶©¹º±±¾© pizza µêµÄsugar pizza
		BeiJingSugarPizza sugarPizza = (BeiJingSugarPizza) bjStore.orderPizza("sugar");
		System.out.println(sugarPizza.getName());
		
		
	}
}
