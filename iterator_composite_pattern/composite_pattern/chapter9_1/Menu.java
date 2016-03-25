package com.designpattern.chapter9_1;

import java.util.ArrayList;
import java.util.Iterator;

// ʵ�ֲ˵���ÿ���˵�����  MenuComponent
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
			component.print(); // ���print �п����� Menu.print Ҳ�п����� MenuItem.print����Ϊ����ָ�����ָ��������󣬶����������������Menu+MenuItem����
		}
	}
}
