package com.designpattern.chapter3;

// ����װ����
public class Espresso extends Beverage{

	public Espresso(){
		desc = "Espresso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	} 
}
