package com.designpattern.chapter9_2;

import java.util.Iterator;

// ���еĲ˵����������ʵ��MenuComponent�ӿ�.
// (����Ϊ���еĲ˵����ǲ˵������������һ���˵������Ƕ����˵����Ǹ��ͼ��˵�)
// ���𿪲˵��Ͳ˵���
public abstract class MenuComponent {
	// ��Ӵ����������ķ���
	public abstract Iterator createIterator(); 
	
	public void add(MenuComponent component) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(MenuComponent component) {
		throw new UnsupportedOperationException();
	}
	
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
	
	public void print() {
		throw new UnsupportedOperationException();
	}
	
	public String getName() {
		 throw new UnsupportedOperationException();
	}
	
	public String getDesc() {
		throw new UnsupportedOperationException();
	}
	
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
}
