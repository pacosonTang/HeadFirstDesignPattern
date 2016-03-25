package com.designpattern.chapter9;

import java.util.ArrayList;
import java.util.Iterator;

public class OldTraverseTest {
	public static void main(String[] args) {
		KFCMenu k_menu = new KFCMenu();
		BJRoastDuckMenu bj_menu = new BJRoastDuckMenu();
		
		ArrayList<MenuItem> list = k_menu.getMenuItems();
		MenuItem[] items = bj_menu.getMenuItems();
		
		System.out.println("=== ������Ѽ������˵� ===");
		// ��һ�α��� ������Ѽ������˵�
		for (int i = 0; i < bj_menu.getCapacity(); i++) {
			System.out.println(items[i]);
		}
		
		System.out.println("=== ����˵������б�˵� ===");
		// �ڶ��α��� ����˵������б�˵�
		Iterator<MenuItem> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}			
	}
}
