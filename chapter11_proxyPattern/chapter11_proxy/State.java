package com.designpattern.chapter11_proxy;

import java.io.Serializable;

public abstract class State implements Serializable{
	protected String name;
	public abstract void insertQuarter();
	public abstract void ejectQuarter();
	public abstract void trunCrank();
	public abstract void dispense();
	
	public String getName() {
		return name;
	}
}
