package com.designpattern.chapter4;

public abstract class PizzaStore{

	// ���������Ĺ�������
	protected abstract Pizza createPizza(String type);
	
	Pizza orderPizza(String type) {
		Pizza pizza = null;
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
























/*public class PizzaStore {
	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory){
		this.factory = factory;
	}
	
	Pizza orderPizza(String type) {
		Pizza pizza = null;
		
		// ע�⣬���ǰ�new �������滻Ϊ��������Ĵ������������ﲻ��ʹ�þ���ʵ����.
		pizza = factory.createPizza(type);
		
		if(type.equals("cheese")){
			pizza = new CheesePizza();
		} else if(type.equals("greek")){
			pizza = new GreekPizza();
		} else if(type.equals("pepperoni")){
			pizza = new PepperoniPizza();
		}
		
		// ..... other operations

		return pizza;
	}
}*/
	/*Pizza orderPizza(String type) {
		Pizza pizza = null;
		
		*//**
		 * ���´�����ֵ����⣺��Щ����û�ж��޸ķ�գ�
		 * ���������ı�������Ӧ�ı�����ζ���͵ý����������޸�
		 *//*
		if(type.equals("cheese")){
			pizza = new CheesePizza();
		} else if(type.equals("greek")){
			pizza = new GreekPizza();
		} else if(type.equals("pepperoni")){
			pizza = new PepperoniPizza();
		}
		
		// ..... other operations
		return pizza;
	}*/
