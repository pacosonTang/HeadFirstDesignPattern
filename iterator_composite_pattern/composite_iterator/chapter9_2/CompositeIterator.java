package com.designpattern.chapter9_2;

import java.util.Iterator;
import java.util.Stack;

// ��������е��ѵ���⣨ת�� head first ���ģʽ��
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
			Iterator iterator = (Iterator) stack.peek(); // �鿴ջ�����󣬶����Ƴ���
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
