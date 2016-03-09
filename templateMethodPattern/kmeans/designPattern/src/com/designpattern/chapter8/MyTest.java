package com.designpattern.chapter8;

import java.util.Arrays;

public class MyTest {
	
	public static void main(String[] args) {
		Duck[] ducks = {
				new Duck("nihao9",9),
				new Duck("nihao10",10),
				new Duck("nihao8",8)
		};
		Arrays.sort(ducks);
		for (Duck duck : ducks) {
			System.out.println(duck);
		}
	}
}
