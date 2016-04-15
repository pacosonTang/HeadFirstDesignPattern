package com.designpattern.chapter3;

import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	protected LowerCaseInputStream(InputStream in) {
		super(in);
	}
	/**
	 * 下面定义了两个read方法，一个针对字节，一个针对字节数组；
	 */
	public int read() throws IOException {
		int c = super.read();
		return (c == -1 ? c : Character.toLowerCase((char) c));
	}

	public int read(byte[] b, int offset, int len) throws IOException {
		int result = super.read(b, offset, len);

		for (int i = offset; i < offset + result; i++) {
			b[i] = (byte) Character.toLowerCase((char) b[i]);
		}
		return result;
	}

}










