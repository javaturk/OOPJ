package org.javaturk.oopj.ch13.math;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerExample {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the limit:");
		int limit = in.nextInt();
		BigInteger sum = BigInteger.valueOf(0);
		for (int i = 1; i < limit; i++) {
			sum = sum.add(BigInteger.valueOf(i));
		}

		System.out.println("Sum: " + sum);
//
//		System.out.println("*** But this may cause problems. ***");
		System.out.println("Sum as long: " + sum.longValue());
		System.out.println("Sum as int: " + sum.intValue());
//
//		System.out.println("Sum as long: " + sum.longValueExact());
//		System.out.println("Sum as int: " + sum.intValueExact());
	}
}
