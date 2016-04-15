package com.designpattern.chapter3;

// 饮料类（被装饰者）
public abstract class Beverage {
	String desc = "unknown beverage";
	
	public String getDesc(){
		return desc;
	}
	
	public abstract double cost();
}
