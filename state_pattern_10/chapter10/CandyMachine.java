package com.designpattern.chapter10;

public class CandyMachine {
	private final static int SOLD_OUT = 0; // 售罄状态
	private final static int NO_QUARTER = 1; // 无币状态,QUARTER==25美分==币
	private final static int HAS_QUARTER = 2; // 有币状态
	private final static int SOLD = 3; // 售卖状态
	private int state = SOLD_OUT;
	private int count = 0;
	
	public CandyMachine(int count) {
		this.count = count;
		if(count > 0) {
			this.state = NO_QUARTER;
		}
	}
	
	public void insertQuarter() { // client投币请求
		if(state == HAS_QUARTER) {
			System.out.println("you can't insert another quarter.");
		} else if(state == NO_QUARTER) {
			System.out.println("you insert a quarter.");
			state = HAS_QUARTER;
		} else if(state == SOLD_OUT) {
			System.out.println("you can't insert a quarter for the machine is sold out.");
		} else if(state == SOLD) {
			System.out.println("please wait, we're already gibing you a candy.");
		}
	}
	
	public void ejectQuarter() { // client请求退钱
		if(state == HAS_QUARTER) {
			System.out.println("quarter returned.");
			state = NO_QUARTER;
		} else if(state == NO_QUARTER) {
			System.out.println("you haven't inserted a quarter.");
		} else if(state == SOLD_OUT) {
			System.out.println("you can't eject for you haven't inserted a quarter yet.");
		} else if(state == SOLD) {
			System.out.println("sorry, you already trune the crank.");
		}
	}
	
	public void turnCrank() { // client转动曲柄动作
		if(state == HAS_QUARTER) {
			System.out.println("you turned, please wait....");
			state = SOLD;
			dispense();
		} else if(state == NO_QUARTER) {
			System.out.println("you turned but there is no quarter.");
		} else if(state == SOLD_OUT) {
			System.out.println("you truned but there's no candy.");
		} else if(state == SOLD) {
			System.out.println("turning twice doesn't get you another candy.");
		}
	}
	
	private void dispense() { // 分发糖果
		if(state == HAS_QUARTER) {
			System.out.println("no candy dispensed.");
		} else if(state == NO_QUARTER) {
			System.out.println("you need to insert a quarter first.");
		} else if(state == SOLD_OUT) {
			System.out.println("no candy dispensed.");
		} else if(state == SOLD) {
			System.out.println("a candy comes rolling out the slot.");
			count--;
			if(count == 0) {
				System.out.println("Oops, there's no candy.");
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
		}
	}

	@Override
	public String toString() {
		String state_str = null;
		
		switch (state) {
		case SOLD_OUT: state_str = "SOLD_OUT"; break;
		case SOLD: state_str = "SOLD"; break;
		case NO_QUARTER: state_str = "NO_QUARTER"; break;
		case HAS_QUARTER: state_str = "HAS_QUARTER"; break;
		}
		return "=== I own " + count + " candies, and stay in " + state_str + " state. ===";
	}
}
