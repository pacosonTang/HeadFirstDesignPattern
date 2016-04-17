package com.designpattern.chapter4;

public class OrderPizzaTest {
	public static void main(String[] args) {
		PizzaStore nyStore = new NewYorkPizzaStore();
		PizzaStore bjStore = new BeiJingPizzaStore();
		
		// 订购纽约pizza 店的sugar pizza 
		Pizza sugarPizza= nyStore.orderPizza("sugar");
		System.out.println(sugarPizza.getName());
		
		// 订购北京 pizza 店的sugar pizza
		sugarPizza = bjStore.orderPizza("sugar");
		System.out.println(sugarPizza.getName());
		
		// 订购纽约pizza 店的salt pizza
		Pizza saltPizza = nyStore.orderPizza("salt");
		System.out.println(saltPizza.getName());
		
		// 订购北京pizza 店的salt pizza
		saltPizza = bjStore.orderPizza("salt");
		System.out.println(saltPizza.getName());
	}
}
