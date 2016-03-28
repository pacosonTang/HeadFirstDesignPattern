package com.designpattern.chapter11_proxy;

public class NoQuarterState extends State {
	transient CandyMachine machine;
	// 加上transient 关键字，告诉jvm 不要序列化这个字段
	
	public NoQuarterState(CandyMachine machine) {
		super.name = "NoQuarterState";
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("you insert a quatter.");
		machine.setState(machine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		if(machine.getState() == machine.getHasQuarterState()) {
			System.out.println("returned a quarter.");
			machine.setState(machine.getNoQuarterState());
		} else {
			System.out.println("you have not inserted a quarter.");
		}
	}

	@Override
	public void trunCrank() {
		System.out.println("you turned but there is no quarter.");
	}

	@Override
	public void dispense() {
		System.out.println("you need to insert a quarter first.");		
	}
}
