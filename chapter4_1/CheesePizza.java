package com.designpattern.chapter4_1;

public class CheesePizza extends Pizza{
	PizzaIngredientFactory factory;
	
	public CheesePizza(PizzaIngredientFactory factory){
		this.factory = factory;
	}
	
	@Override
	public void prepare() {
		System.out.println("preparing" + name);
		dough = factory.createDough();
		sauce = factory.createSauce();
		cheese = factory.createCheese();
	}
}
