package com.research.test2;

import java.util.Arrays;

public class Temp {
	public static void main(String[] args) {
		double[][] array = {{1,2,3},{2,2,2},{3,3,3}};
		Arrays.fill(array[0], 0);
		System.out.println(array[0][0]);
	}
}
