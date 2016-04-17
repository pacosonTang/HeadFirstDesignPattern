package com.designpattern.chapter4_1;

public abstract class Pizza {
	String type;
	String name;
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	Clam clam;
	
	public abstract void prepare();
	
	public void bake(){
		System.out.println("bake");
	}
	
	public void cut(){
		System.out.println("cut");
	}
	
	public void box(){
		System.out.println("box");
	}
	
	public String getName(){
		return name;
	}
}
