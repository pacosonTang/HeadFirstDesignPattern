package com.designpattern.chapter11_proxy;

// ÖÐ½±×´Ì¬
public class WinnerState extends State {
	transient CandyMachine machine;
	
	public WinnerState(CandyMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("error.");
	}

	@Override
	public void ejectQuarter() { // clientÍËÇ®ÇëÇó
		System.out.println("error.");
	}

	@Override
	public void trunCrank() {
		System.out.println("error.");
	}

	@Override
	public void dispense() {
		System.out.println("you're a winner. you get 2 candies for your quarter.");
		machine.releaseBall();
		if(machine.getCount() == 0) {
			machine.setState(machine.getSoldOutState());
		} else {
			machine.releaseBall();
			if(machine.getCount() > 0) {
				machine.setState(machine.getNoQuarterState());
			} else {
				System.out.println("Oops, out of candies.");
				machine.setState(machine.getSoldOutState());
			}
		}
	}
}
