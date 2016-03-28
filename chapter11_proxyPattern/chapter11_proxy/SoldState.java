package com.designpattern.chapter11_proxy;

// ÊÛÂô×´Ì¬
public class SoldState extends State {
	transient CandyMachine machine;
	
	
	public SoldState(CandyMachine machine) {
		super.name = "SoldState";
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {		
		System.out.println("please wait, we're already giving you a candy.");		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("sorry, you've already turned the crank.");
	}

	@Override
	public void trunCrank() {
		System.out.println("turning twice doesn't get you another candy.");
	}

	@Override
	public void dispense() {
		machine.releaseBall();
		if(machine.getCount() > 0) {
			machine.setState(machine.getNoQuarterState());
		} else {
			machine.setState(machine.getSoldOutState());
		}
	}
}
