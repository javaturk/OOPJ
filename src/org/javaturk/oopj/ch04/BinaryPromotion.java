package org.javaturk.oopj.ch04;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      This is an example that shows arithmetic promotions made in operators.
 */
public class BinaryPromotion {

	public static void main(String[] args) {
		byte b1 = 5;
		byte b2 = 8;
//		byte b3 = b1 * b2; // compile error: possible loss of precision
		byte b3 = (byte) (b1 * b2); // OK
		System.out.println(b3);
		
		byte b = 3;
//		byte c = b >>> b;
		byte c = (byte) (b >>> b);
	}
}
