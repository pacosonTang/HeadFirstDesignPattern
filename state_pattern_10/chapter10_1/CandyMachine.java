package com.designpattern.chapter10_1;

public class CandyMachine {
	private State winnerState; //中奖状态
	private State soldOutState; // 售罄状态
	private State noQuarterState; // 无币状态,QUARTER==25美分==币
	private State hasQuarterState; // 有币状态
	private State soldState; // 售卖状态
	private State state;
	private int count = 0;
	
	public CandyMachine(int count) {
		soldOutState = new SoldOutState(this);
		soldState = new SoldState(this);
		hasQuarterState = new HasQuarterState(this);
		noQuarterState = new NoQuarterState(this);
		winnerState = new WinnerState(this);
		state = soldOutState;
		
		this.count = count;
		if(count > 0) {
			state = noQuarterState;
		}
	}
	
	public void insertQuarter() { // client投币请求
		state.insertQuarter();
	}
	
	public void ejectQuarter() { // client请求退钱
		state.ejectQuarter();
	}
	
	public void turnCrank() { // client转动曲柄动作
		state.trunCrank();
		state.dispense();
	}
	
	public void releaseBall() { // 释放糖果
		System.out.println("a candy comes rolling out the slot....");
		if(count != 0) {
			count--;
		}
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	public State getWinnerState() {
		return winnerState;
	}

	public void setWinnerState(State winner) {
		this.winnerState = winner;
	}	
	
	@Override  
    public String toString() {  
        String state_str = null;  
          
        switch (state.getName()) {  
        case "SoldOutState": state_str = "SOLD_OUT"; break;  
        case "SoldState": state_str = "SOLD"; break;  
        case "NoQuarterState": state_str = "NO_QUARTER"; break;  
        case "HasQuarterState": state_str = "HAS_QUARTER"; break;  
        }  
        return "=== I own " + count + " candies, and stay in " + state_str + " state. ===";  
    }  
}
