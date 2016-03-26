package com.designpattern.chapter10;

public class CandyMachineTest {
	public static void main(String[] args) {
		CandyMachine cm = new CandyMachine(5);
		System.out.println(cm);
		
		System.out.println("====== 1st test: ======");
		cm.insertQuarter();
		cm.turnCrank();
		System.out.println(cm);
		
		System.out.println("====== 2nd test: ======");
		cm.insertQuarter();
		cm.ejectQuarter();//要求售卖机退钱
		cm.ejectQuarter();//要求售卖机第二次退钱
		
		System.out.println("====== 3rd test: ======");
		cm.insertQuarter();
		cm.ejectQuarter();
		cm.turnCrank();// 请求退钱后，不应该得到糖果
		System.out.println(cm);
	}
}
