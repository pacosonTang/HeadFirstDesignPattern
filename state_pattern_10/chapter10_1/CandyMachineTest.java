package com.designpattern.chapter10_1;

public class CandyMachineTest {
	public static void main(String[] args) {
		CandyMachine cm = new CandyMachine(50);
		System.out.println(cm);
		
		System.out.println("====== init state ======");
		System.out.println(cm);
		
		// 第一次测试
		cm.insertQuarter();
		cm.turnCrank();
		System.out.println(cm);
				
		// 第二次测试
		cm.turnCrank();
		System.out.println(cm);
		
		// 第3次测试： 在为投币的情况下退币请求
		cm.ejectQuarter();
		System.out.println(cm);
		
		System.out.println("\n\n ====== 下面进入循环测试（中奖） ======");
		for (int i = 0; i < 5; i++) {
			cm.insertQuarter();
			cm.turnCrank();
			System.out.println(cm);
		}
	}
}
