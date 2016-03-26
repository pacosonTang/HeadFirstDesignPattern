package com.designpattern.chapter10_1;

// ÊÛóÀ×´Ì¬
public class SoldOutState extends State {
	CandyMachine machine;
	
	public SoldOutState(CandyMachine machine) {
		super.name = "SoldOutState";
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("you can't insert a quarter for there's no candies.");		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("you have not inserted a quarter.");
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
