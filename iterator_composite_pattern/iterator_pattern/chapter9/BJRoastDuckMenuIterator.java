package com.designpattern.chapter9;

import java.util.Iterator;

public class BJRoastDuckMenuIterator implements Iterator<MenuItem>{
	private MenuItem[] items;
	private int position = 0;
	
	public BJRoastDuckMenuIterator(MenuItem[] items) {
		this.items = items;
	}
	
	@Override
	public boolean hasNext() {
		if(position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public MenuItem next() {		
		return items[position++];
	}
}





