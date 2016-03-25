package com.designpattern.chapter9_2;

import java.util.Iterator;

// 所有的菜单组件都必须实现MenuComponent接口.
// (即认为所有的菜单都是菜单组件，不管是一级菜单，还是二级菜单或是更低级菜单)
// 区别开菜单和菜单项
public abstract class MenuComponent {
	// 添加创建迭代器的方法
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
