package org.javaturk.oopj.ch04;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      This is an example about unary operators.
 */
public class UnaryIncAndDecOperators {

	public static void main(String args[]) {
		unaryIncrementAndDecrement1();
//		unaryIncrementAndDecrement2();
//		weirdBehavior();
	}

	/**
	 * Learn use of ++ and -- when used alone. Thay have no difference when used
	 * alone. Pre and post usages increments and decrements the variables's value.
	 */
	public static void unaryIncrementAndDecrement1() {
		int i = 5;
		++i; // increment by 1
		prt("i: " + i);

		i++; // increment by 1
		prt("i: " + i);

		--i; // decrement by 1
		prt("i: " + i);

		i--; // decrement by 1
		prt("i: " + i);
	}

	/**
	 * Learn use of ++ and -- when used in an expression. Thay have a drastic
	 * difference when used in an expression. Pre and post usages pre/post
	 * increments and pre/post decrements the variables's value.
	 */
	public static void unaryIncrementAndDecrement2() {
		int i = 1;
		prt("i   : \t" + i);
		prt("++i : \t" + ++i); // Pre-increment
		prt("i++ : \t" + i++); // Post-increment
		prt("i   : \t" + i);
		prt("--i : \t" + --i); // Pre-decrement
		prt("i-- : \t" + i--); // Post-decrement
		prt("i   : \t" + i);

		System.out.println();

		i = 1;
		prt("i: \t" + i);
		int j = ++i;
		prt("i: \t" + i + "\t j : \t" + j); // Pre-increment
		j = i++;
		prt("i: \t" + i + "\t j : \t" + j); // Post-increment
		prt("i: \t" + i);
		j = --i;
		prt("i: \t" + i + "\t j : \t" + j); // Pre-decrement
		j = i--;
		prt("i: \t" + i + "\t j : \t" + j); // Post-decrement
		prt("i: \t" + i);
	}

	/**
	 * // For a good explanation: //
	 * http://skeletoncoder.blogspot.com/2006/09/java-tutorials-i-i.html and //
	 * http://forums.devx.com/archive/index.php/t-27360.html
	 */
	public static void weirdBehavior() {
		int i = 0;

		System.out.println("That's ok.");
		i = ++i;
		System.out.println("i: " + i);

		i = ++i + 2;
		System.out.println("i: " + i);

		i = 0;
		
		System.out.println("That's not ok.");
		i = i++;
		
		System.out.println("i: " + i); // Why doesn't i increase?

		i = i++ + 2;				   // Why doesn't i++ increase i?
		System.out.println("i: " + i);

		System.out.println("That's ok too.");
		
		i = 0;
		
		int j = i++;
		System.out.println("i: " + i);
		System.out.println("j: " + j);

		int k = i++;
		System.out.println("i: " + i);
		System.out.println("k: " + k);
	}

	static void prt(String s) {
		System.out.println(s);
	}
}
