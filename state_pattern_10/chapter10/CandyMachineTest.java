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
		cm.ejectQuarter();//Ҫ����������Ǯ
		cm.ejectQuarter();//Ҫ���������ڶ�����Ǯ
		
		System.out.println("====== 3rd test: ======");
		cm.insertQuarter();
		cm.ejectQuarter();
		cm.turnCrank();// ������Ǯ�󣬲�Ӧ�õõ��ǹ�
		System.out.println(cm);
	}
}
