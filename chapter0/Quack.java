package com.designpattern.chapter0;

public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("quack");
	}
}
