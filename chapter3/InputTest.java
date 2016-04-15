package com.designpattern.chapter3;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputTest {
	public static void main(String[] args) {
		int c;
		String path = System.getProperty("user.dir") + File.separator + "src"
				+ File.separator + "com" + File.separator + "designpattern"
				+ File.separator + "chapter3" + File.separator;

		try {
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(
					new FileInputStream(path + "test.txt")));
			while ((c = in.read()) >= 0)
				System.out.print((char) c);
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
