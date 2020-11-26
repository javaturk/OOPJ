package org.javaturk.oopj.ch04;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      This is an example about conversion that take place with unary operators.
 */
public class UnaryLogicalOperator {

	public static void main(String[] args) {
		boolean b1 = true;
//		!b1; // Error!
		b1 = !b1;
		System.out.println(b1);
		
//		b1 != b1; // Can't do that! != is not a compound assignment, it is a relational operator.!
	}
}
