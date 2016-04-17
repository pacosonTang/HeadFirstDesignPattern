package com.designpattern.chapter4;

public class BeiJingPizzaStore extends PizzaStore{

	// 北京加盟比萨店的具体的工厂方法
	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("sugar")){
			pizza = new BeiJingSugarPizza();
		}else if(type.equals("salt")){ // 添加北京 盐味披萨
			pizza = new BeiJingSaltPizza();
		}
		return pizza;
	}
}
