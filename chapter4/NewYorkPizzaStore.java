package com.designpattern.chapter4;

public class NewYorkPizzaStore extends PizzaStore{

	// ŦԼ���˱�����ľ���Ĺ�������
	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("sugar")){
			pizza = new NewYorkSugarPizza();
		}else if(type.equals("salt")){
			pizza = new NewYorkSaltPizza();
		}
		return pizza;
	}
}
