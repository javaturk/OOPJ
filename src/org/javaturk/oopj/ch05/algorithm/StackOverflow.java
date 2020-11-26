package org.javaturk.oopj.ch05.algorithm;

public class StackOverflow {

	private static int count;

	public static void main(String[] args) {
		f();
	}

	public static void f() {
		count++;
		if (count % 100 == 0)
			System.out.println("count: " + count);
		f();
	}
}
