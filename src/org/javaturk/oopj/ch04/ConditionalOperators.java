
package org.javaturk.oopj.ch04;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      This is an example about conditional operators.
 */
public class ConditionalOperators {

	public static void main(String args[]) {

		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = b1 & b2;
		boolean b4 = b1 | b2;
		boolean b5 = b1 ^ b2;

		System.out.println("b1 & b2: " + b3);
		System.out.println("b1 | b2: " + b4);
		System.out.println("b1 ^ b2: " + b5);
		System.out.println("!b1: " + !b1);

		System.out.println();

		if ((getOne() == 2) & (getTwo() == 2)) {
			System.out.println("value1 is 1 AND value2 is 2");
		}

		if ((getOne() == 1) | (getTwo() == 2)) {
			System.out.println("value1 is 1 OR value2 is 2");
		}
	}

	public static int getOne() {
		System.out.println("In getOne()");
		return 1;
	}

	public static int getTwo() {
		System.out.println("In getTwo()");
		return 2;
	}
}
