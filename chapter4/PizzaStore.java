package com.designpattern.chapter4;

public abstract class PizzaStore{

	// 比萨店抽象的工厂方法
	protected abstract Pizza createPizza(String type);
	
	Pizza orderPizza(String type) {
		Pizza pizza = null;
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
























/*public class PizzaStore {
	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory){
		this.factory = factory;
	}
	
	Pizza orderPizza(String type) {
		Pizza pizza = null;
		
		// 注意，我们把new 操作符替换为工厂对象的创建方法。这里不再使用具体实例化.
		pizza = factory.createPizza(type);
		
		if(type.equals("cheese")){
			pizza = new CheesePizza();
		} else if(type.equals("greek")){
			pizza = new GreekPizza();
		} else if(type.equals("pepperoni")){
			pizza = new PepperoniPizza();
		}
		
		// ..... other operations

		return pizza;
	}
}*/
	/*Pizza orderPizza(String type) {
		Pizza pizza = null;
		
		*//**
		 * 以下代码出现的问题：这些代码没有对修改封闭，
		 * 如果比萨店改变它所供应的比萨风味，就得进到这里来修改
		 *//*
		if(type.equals("cheese")){
			pizza = new CheesePizza();
		} else if(type.equals("greek")){
			pizza = new GreekPizza();
		} else if(type.equals("pepperoni")){
			pizza = new PepperoniPizza();
		}
		
		// ..... other operations
		return pizza;
	}*/
