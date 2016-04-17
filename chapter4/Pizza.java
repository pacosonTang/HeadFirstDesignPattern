package com.designpattern.chapter4;

public class Pizza {
	String type;
	String name;
	
	public void prepare(){
		System.out.println("prepare");
	}
	
	public void bake(){
		System.out.println("bake");
	}
	
	public void cut(){
		System.out.println("cut");
	}
	
	public void box(){
		System.out.println("box");
	}
	
	public String getName(){
		return name;
	}
	
	public Pizza orderPizza(String type){
		Pizza pizza = null;
		
		if(type.equals("cheese")) {
			pizza = new CheesePizza();
		}else if(type.equals("greek")) {
			pizza = new GreekPizza();
		} else if(type.equals("pepperoni")){
			pizza = new PepperoniPizza();
		}
		/**
		 * 以上代码出现了问题：这些代码没有对修改封闭，
		 * 若比萨店改变所供应的比萨风味，就必须要到这里
		 * 修改源代码， 如北京糖味披萨, 必须修改源码；
		 */
		
		// else if(type.equals("beijing_sugar"))
		return pizza;
	}
}
