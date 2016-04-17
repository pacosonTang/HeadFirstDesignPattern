package com.designpattern.chapter4;

public class BeiJingPizzaStore extends PizzaStore{

	// �������˱�����ľ���Ĺ�������
	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("sugar")){
			pizza = new BeiJingSugarPizza();
		}else if(type.equals("salt")){ // ��ӱ��� ��ζ����
			pizza = new BeiJingSaltPizza();
		}
		return pizza;
	}
}
