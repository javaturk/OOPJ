package org.javaturk.oopj.ch02;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class ValuesOfExpressions {

	public static void main(String[] args) {
		int k = 2_147_483_647; // Max limit of an int number in java

		int i = k + 1;
		System.out.println(i);

		// That's not an unreachable code :)
		int a = 15;
		int m;
		if (a < 11)
			m = 7;

		System.out.println();

		// m may not have been initialized!
		// System.out.println(m);
	}
}
