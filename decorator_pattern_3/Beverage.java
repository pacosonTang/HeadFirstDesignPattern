package com.designpattern.chapter3;

// �����ࣨ��װ���ߣ�
public abstract class Beverage {
	String desc = "unknown beverage";
	
	public String getDesc(){
		return desc;
	}
	
	public abstract double cost();
}
