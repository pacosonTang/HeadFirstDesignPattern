package com.designpattern.chapter9_1;

import java.util.ArrayList;
import java.util.Iterator;

// 实现菜单，每个菜单都是  MenuComponent
public class Menu extends MenuComponent{
	ArrayList<MenuComponent> components = new ArrayList<>();
	protected String name;
	protected String desc;	
	
	public Menu(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	@Override
	public void add(MenuComponent component) {
		components.add(component);
	}

	@Override
	public void remove(MenuComponent component) {
		components.remove(component);
	}

	@Override
	public MenuComponent getChild(int i) {
		return components.get(i);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDesc() {
		return desc;
	}
	
	@Override
	public void print() {		
		System.out.println("====== name=" + name + ", desc=" + desc + " ======");
		Iterator<MenuComponent> iterator = components.iterator();
		while(iterator.hasNext()) {
			MenuComponent component = iterator.next();
			component.print(); // 这个print 有可能是 Menu.print 也有可能是 MenuItem.print（因为父类指针可以指向子类对象，而子类对象有两个（Menu+MenuItem））
		}
	}
}
