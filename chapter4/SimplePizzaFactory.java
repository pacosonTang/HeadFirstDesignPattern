package com.designpattern.chapter4;

public class SimplePizzaFactory {
	
	/**
	 * 在这个简单比萨工厂内，定义了一个createPizza()方法；
	 * 所有客户用这个方法来实例化新对象
	 * @param type
	 * @return
	 */
	public Pizza createPizza(String type){
		Pizza pizza = null;
		
		if(type.equals("cheese")){
			pizza = new CheesePizza();
		} else if(type.equals("greek")){
			pizza = new GreekPizza();
		} else if(type.equals("pepperoni")){
			pizza = new PepperoniPizza();
		}
		return pizza;
	}
}
