
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
public class RangeComparision {

	public static void main(String[] args) {
		int i = 5;

		// boolean b = 3 < i < 7; // Illegal!

		boolean b = (3 < i) & (i < 7);

		System.out.println(b);

	}
}
