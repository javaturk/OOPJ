package org.javaturk.oopj.ch13.random;

import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println("Booelan: " + random.nextBoolean());
		System.out.println("Float: " + random.nextFloat());
		System.out.println("Double: " + random.nextDouble());
		System.out.println("Double (Gaussian): " + random.nextGaussian());
		System.out.println("Int: " + random.nextInt());
		System.out.println("Int: " + random.nextInt(100));
		System.out.println("Long: " + random.nextLong());
	}
}
