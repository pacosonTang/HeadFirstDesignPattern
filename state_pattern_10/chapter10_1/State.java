package com.designpattern.chapter10_1;

public abstract class State {
	protected String name;
	public abstract void insertQuarter();
	public abstract void ejectQuarter();
	public abstract void trunCrank();
	public abstract void dispense();
	
	public String getName() {
		return name;
	}
}
