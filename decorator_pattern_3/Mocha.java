package com.designpattern.chapter3;

// 具体的装饰者
public class Mocha extends CondimentDecorator{
	Beverage beverage;
	
	public Mocha(Beverage b){
		this.beverage = b;
	}

	@Override
	public String getDesc() {
		return beverage.getDesc()+ ", Mocha";
	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}
}
