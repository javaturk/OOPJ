package org.javaturk.oopj.ch05.decision;

public class DanglingElse {

	public static void main(String[] args) {
		int i = (int) (100 * Math.random());
		int j = (int) (100 * Math.random());

		if (i > j)
			if (i - j > 10)
				System.out.println("i is at least 10 greater than j.");
			else
				System.out.println("i is greater than j.");
		else
			System.out.println("i is not greater than j.");
		
		System.out.println("i: " + i + " j: " + j);
		
		boolean b1;
		boolean b2;
		
		b1 = (b2 = true);
		System.out.println(b1);
	}
}
