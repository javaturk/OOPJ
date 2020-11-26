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
public class ReturnDemo {

	public static void main(String[] args) {
		System.out.println(max(10, 5));
		System.out.println(max(5, 10));
		System.out.println(max(5, 5));
	}

	static int max(int value1, int value2) {
		if (value1 > value2)
			return +1;
		else if (value1 < value2)
			return -1;
		else
			return 0; // Match
		
		// Comment out following line
//		 System.out.println("Metot sonu!");
	}

	public void method1() {

	}

	public void method2() {
		return;
//		System.out.println("");
	}

	public String method3() {
		return new String("Java");
//		return null;
	}
}
