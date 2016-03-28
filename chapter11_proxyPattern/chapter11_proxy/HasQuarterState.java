package com.designpattern.chapter11_proxy;

import java.util.Random;

// �б�״̬
public class HasQuarterState extends State {
	Random random = new Random();
	transient CandyMachine machine;
	
	public HasQuarterState(CandyMachine machine) {
		super.name = "HasQuarterState"; 
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("you can't insert another quarter.");
	}

	@Override
	public void ejectQuarter() { // client��Ǯ����
		System.out.println("quarter returned.");
		machine.setState(machine.getNoQuarterState());
	}

	@Override
	public void trunCrank() { // �б�״̬�£����м������н�����
		System.out.println("you turned , please waiting......");
		int winner = random.nextInt(5);
		System.out.println("\nrandom winner == " + winner);
		if(winner == 2 && machine.getCount() > 1) {
			machine.setState(machine.getWinnerState());
		} else {
			machine.setState(machine.getSoldState());
		}
	}

	@Override
	public void dispense() {
		System.out.println("no candies dispensed.");		
	}
}
