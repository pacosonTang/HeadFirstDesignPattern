package com.designpattern.chapter3;

// ����װ����
public class HouseBlend extends Beverage{

	public HouseBlend(){
		desc = "house blend coffee";
	}
	
	@Override
	public double cost() {
		return .89;
	} 
}
