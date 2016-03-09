package com.designpattern.chapter0;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("i can't quack");
	}
}
