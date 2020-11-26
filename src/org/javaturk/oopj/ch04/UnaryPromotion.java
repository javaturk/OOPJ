package org.javaturk.oopj.ch04;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      This is an example about promotion that take place with unary operators.
 */
public class UnaryPromotion {

	public static void main(String[] args) {
		byte b = 3;
		b = (byte) +b;
		b = (byte) +b;		// Unary promotion
		b = (byte) -b;		// Unary promotion
		b = (byte) ~b;		// Unary promotion
		
		byte b1 = ++b;
	}
}
