package org.javaturk.oopj.ch05.loop;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      This is an example that shows arithmetic promotions made in operators.
 */
public class ListCharactersWithIf {

	public static void main(String[] args) {

		for (char c = 0; c < 65535; c++) {
			System.out.print("\t" + (int) c + " : " + c);
			if (c % 10 == 0 & c != 0 & c != 10)
				System.out.print("\n");
		}
	}
}