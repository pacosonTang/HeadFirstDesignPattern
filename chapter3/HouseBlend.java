package com.designpattern.chapter3;

// 具体装饰者
public class HouseBlend extends Beverage{

	public HouseBlend(){
		desc = "house blend coffee";
	}
	
	@Override
	public double cost() {
		return .89;
	} 
}
