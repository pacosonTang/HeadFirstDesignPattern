package com.designpattern.chapter4;

public class NYIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new Dough();
	}

	@Override
	public Sauce createSauce() {
		return new Sauce();
	}

	@Override
	public Cheese createCheese() {
		return new Cheese();
	}

	@Override
	public Clam createClam() {
		return new Clam();
	}

}
