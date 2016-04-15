package com.designpattern.chapter3;
//�����װ����
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
