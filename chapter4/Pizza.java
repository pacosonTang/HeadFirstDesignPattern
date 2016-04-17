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
		 * ���ϴ�����������⣺��Щ����û�ж��޸ķ�գ�
		 * ��������ı�����Ӧ�ı�����ζ���ͱ���Ҫ������
		 * �޸�Դ���룬 �籱����ζ����, �����޸�Դ�룻
		 */
		
		// else if(type.equals("beijing_sugar"))
		return pizza;
	}
}
