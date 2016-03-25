package com.designpattern.chapter9_2;

import java.util.Iterator;
import java.util.Stack;

// 这个代码有点难得理解（转自 head first 设计模式）
public class CompositeIterator  implements Iterator{
	private Stack stack = new Stack();
	
	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}
	
	@Override
	public boolean hasNext() {
		if(stack.empty()) {
			return false;
		} else {
			Iterator iterator = (Iterator) stack.peek(); // 查看栈顶对象，而不移除他
			if(!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}

	@Override
	public Object next() {
		if(hasNext()) {
			Iterator iterator = (Iterator) stack.peek();
			MenuComponent component = (MenuComponent)iterator.next();
			if(component instanceof Menu) {
				stack.push(component.createIterator());
			}
			return component;
		} else {
			return null;
		}
	}
	
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
