package com.designpattern.chapter10_1;

public class CandyMachineTest {
	public static void main(String[] args) {
		CandyMachine cm = new CandyMachine(50);
		System.out.println(cm);
		
		System.out.println("====== init state ======");
		System.out.println(cm);
		
		// ��һ�β���
		cm.insertQuarter();
		cm.turnCrank();
		System.out.println(cm);
				
		// �ڶ��β���
		cm.turnCrank();
		System.out.println(cm);
		
		// ��3�β��ԣ� ��ΪͶ�ҵ�������˱�����
		cm.ejectQuarter();
		System.out.println(cm);
		
		System.out.println("\n\n ====== �������ѭ�����ԣ��н��� ======");
		for (int i = 0; i < 5; i++) {
			cm.insertQuarter();
			cm.turnCrank();
			System.out.println(cm);
		}
	}
}
