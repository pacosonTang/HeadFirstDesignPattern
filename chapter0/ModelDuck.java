package com.designpattern.chapter0;

public class ModelDuck extends Duck{
	public ModelDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("i am a model duck!");
	}
}
