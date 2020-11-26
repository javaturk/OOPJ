package org.javaturk.oopj.ch04;

/**
 * This example shows conditional operators & and | and their shortcuts && and
 * ||. See the effects of shortcuts.
 * 
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      This is an example about unary operators.
 */

public class TernaryOperator {

	public static void main(String args[]) {
		basics();
//		ifElseEquivalnce();
//		evaluation();
//		hard();
//		errors();
	}

	public static void basics() {
		int i = 18;
		int j = 11;
		int min = (i <= j) ? i : j;
		System.out.println("Min: " + min);

		System.out.println((i <= j) ? "true" : "false");
		System.out.println(!(i <= j) ? "true" : "false");

		int x = 0;
		int y = 5;
		int z = 9;
		int t = x == 2 ? y : z;
		System.out.println(t);
	}

	public static void ifElseEquivalnce() {
		int i = 8;
		int j = 11;
		int min = (i <= j) ? i : j;
		System.out.println("Min: " + min);

		if (i <= j)
			min = i;
		else
			min = j;
		System.out.println("Min: " + min);

		String string1 = "I love Java very much!";
		String string2 = "I love nothing!";
		String string3 = (string1.matches(".*Java.*")) ? string1 : string2;
		System.out.println("String3: " + string3);

		if (string1.matches(".*Java.*"))
			string3 = string1;
		else
			string3 = string2;
		System.out.println("String3: " + string3);
	}

	public static void evaluation() {
		System.out.println(true ? "true" : "false");
		System.out.println(false ? "true" : "false");

		System.out.println(true ? returnTrue() : returnFalse());
		System.out.println(false ? returnTrue() : returnFalse());
	}

	private static String returnTrue() {
		System.out.println("in returnTrue()");
		return "true";
	}

	private static String returnFalse() {
		System.out.println("in returnFalse()");
		return "false";
	}
	
	private static void hard() {
		boolean b = false;

		int x = (int) (Math.random() * 1000);
		int y = (int) (Math.random() * 1000);
		int z = (int) (Math.random() * 1000);
//		x = 100;
//		y = 200;
//		z = 300;

		System.out.println("x: " + x + " y: " + y + " z: " + z);

		b = x < y ? x < z ? true : false : false; // Either x is smaller than both y and z at the same time or x is not smaller than y
		System.out.println(b);

		b = (x < y ? (x < z ? true : false) : false);
		System.out.println(b);
	}

	public static void errors() {
		int i = 8;
		int j = 11;
//		(i<j) ? System.out.println(i) : System.out.println(j); // Can't do this.

		int x = 0;
		int y;
		int z;
//		(x == 2 ? y : z ) = 5; // The left-hand side of an assignment must be a variable
	}
}
