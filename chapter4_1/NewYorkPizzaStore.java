package com.designpattern.chapter4_1;

public class NewYorkPizzaStore extends PizzaStore{

	public NewYorkPizzaStore(){
		this.factory = new NYIngredientFactory();
	}
	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese")){
			pizza = new CheesePizza(factory);
		}else if(type.equals("clam")){
			pizza = new ClamPizza(factory);
		}
		return pizza;
	}
}
