package com.designpattern.chapter4;

public class OrderPizzaTest {
	public static void main(String[] args) {
		PizzaStore nyStore = new NewYorkPizzaStore();
		PizzaStore bjStore = new BeiJingPizzaStore();
		
		// ����ŦԼpizza ���sugar pizza 
		Pizza sugarPizza= nyStore.orderPizza("sugar");
		System.out.println(sugarPizza.getName());
		
		// �������� pizza ���sugar pizza
		sugarPizza = bjStore.orderPizza("sugar");
		System.out.println(sugarPizza.getName());
		
		// ����ŦԼpizza ���salt pizza
		Pizza saltPizza = nyStore.orderPizza("salt");
		System.out.println(saltPizza.getName());
		
		// ��������pizza ���salt pizza
		saltPizza = bjStore.orderPizza("salt");
		System.out.println(saltPizza.getName());
	}
}
