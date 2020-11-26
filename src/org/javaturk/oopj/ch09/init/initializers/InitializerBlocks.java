package org.javaturk.oopj.ch09.init.initializers;

import java.util.Random;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class InitializerBlocks {

	double d;
//	d = 3.14D; // Can't do this. Use initializers instead.

	{
		System.out.println("\nIn an instance initializer block-1.");
		d = calculateD();
	}

	int l;

	{
		long l = 5; // Local var that shadows instance var
		System.out.println("\nIn an instance initializer block-2.");
		Random random = new Random();
		l = random.nextLong();
		this.l = (int) (Math.abs(l) % 100);
	}

	static int i;

	static {
		System.out.println("In a static initializer block.");
		double d = Math.random();
		int i; // Local var that shadows static var
		if (d < 0.5) {
			i = 5;
		} else
			i = 10;
		InitializerBlocks.i = i;
	}

	static int[] ints = new int[10];

	static {
		System.out.println("\nInitializing the static array.");
		for (int i = 0; i < ints.length; i++)
			ints[i] = (i + 1) * 10;
	}

	String s;

	{
		s = new String("Javaaaa!"); 
	}

	double calculateD() {
		return Math.random() * 10;
	}

	void printInfo() {
		System.out.println("\nVariables");
		System.out.println("d: " + d);
		System.out.println("l: " + l);
		System.out.println("i: " + i);
		System.out.println("\nArray");
		for (int i : ints)
			System.out.print(i + " ");
		System.out.println("\ns: " + s);
	}

	public static void main(String[] args) {
		new InitializerBlocks();
		new InitializerBlocks();
		InitializerBlocks ib = new InitializerBlocks();
//		ib.printInfo();
	}
}
