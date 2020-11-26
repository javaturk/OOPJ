package org.javaturk.oopj.ch05;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      This is an example that shows arithmetic promotions made in operators.
 */
public class ContinueDemo {

	public static void main(String args[]) {
		for (int i = 1; i <= 5; ++i) {
			if (i == 4)
				continue; // Skip the rest for this iteration
			System.out.println(i + "\t" + Math.sqrt(i));
		} // end of for loop
	}
}
