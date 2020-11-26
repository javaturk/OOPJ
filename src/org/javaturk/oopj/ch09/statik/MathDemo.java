package org.javaturk.oopj.ch09.statik;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class MathDemo {

	public static void main(String[] args) {
		System.out.println("Math.PI: " + Math.PI);
		System.out.println("Math.E:  " + Math.E);

		System.out.println();

		int i = 5;
		double j = Math.pow(2, i);
		System.out.println("2^5 is " + j);

		System.out.println();

		int angle = 90;
		double degree = 90 * 2 * Math.PI / 360;
		System.out.println("Sin of 90 is " + Math.sin(degree));

		degree = Math.tan(degree);
		System.out.println("Tangent of 90 is " + Math.tan(degree));

		System.out.println();

		double squareRootOf2 = Math.sqrt(2);
		System.out.println("Square root of 2: " + squareRootOf2);
		double cubeRootOf2 = Math.cbrt(2);
		System.out.println("Cube root of 2:   " + cubeRootOf2);

		System.out.println("\nRandom numbers between 0.0 and 1.0 distributed normally.");

		for (int k = 0; k < 10; k++)
			System.out.println(Math.random());
	}
}
