package com.designpattern.chapter3;
//具体的装饰者
public class Whip extends CondimentDecorator{
	Beverage beverage;
	
	public Whip(Beverage b){
		this.beverage = b;
	}

	@Override
	public String getDesc() {
		return beverage.getDesc()+ ", Whip";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}
}
