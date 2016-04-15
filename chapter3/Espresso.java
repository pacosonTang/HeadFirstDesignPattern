package com.designpattern.chapter3;

// 具体装饰者
public class Espresso extends Beverage{

	public Espresso(){
		desc = "Espresso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	} 
}
