package org.javaturk.oopj.ch13.math;

import java.math.BigDecimal;

public class BigDecimalExample {
	public static void main(String[] args) {
		BigDecimal bd = BigDecimal.valueOf(12332423423.123456789123456789123456789123456789123456789);
		System.out.println("Precision: " + bd.precision());
		System.out.println("Scale: " + bd.scale());

//		bd = BigDecimal.valueOf(Math.PI);
		System.out.println("Precision: " + bd.precision());
		System.out.println("Scale: " + bd.scale());
		System.out.println("Square of " + bd + " " + bd.multiply(bd));

		BigDecimal radius = BigDecimal.TEN;
		BigDecimal area = bd.multiply(radius).multiply(radius).multiply(radius);
		System.out.println("Area: " + area);

		double d1 = 10;
		double d2 = 3;
		System.out.println("10/3 = " + d1 / d2);

		BigDecimal bd1 = BigDecimal.TEN;
		BigDecimal bd2 = BigDecimal.valueOf(3.0);
//		System.out.println("10/3 = " + bd1.divide(bd2));
	}
}
