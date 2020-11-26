
package org.javaturk.oopj.ch08.varArg;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class VarArgMethod {

	// main as var arg method
	public static void main(String... args) {

		calculateAverage(4, 3);
		calculateAverage(4, 3, 8);

		int a[] = { 15, 25, 35, 45, 55, 65 };
		calculateAverageWithArray(a);

		int b[] = { 15, 25, 35, 45, 55, 65, 75, 86 };
		calculateAverageWithArray(b);

		average(); // Caşll ewith no argument
		average(1);
		average(1, 2, 3, 4);
		average(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		average(0xAB);
		average(b);

		anotherAverage(2, true, 3, 4, 5);
	}

	// Method with two arguments
	public static void calculateAverage(int x, int y) {
		System.out.println("Average: " + (double) (x + y) / 2);
	}

	// Method with three arguments and goes on!
	public static void calculateAverage(int x, int y, int z) {
		System.out.println("Average: " + (double) (x + y + z) / 2);
	}

	// Method with array arguments. But it needs to be called by providing an array
	public static void calculateAverageWithArray(int[] array) {
		int sum = 0;
		int i = 0;
		for (int x : array) {
			sum += x;
			i++;
		}
		System.out.println("Average: " + (double) sum / i);
	}

	// That's the solutions.
	public static void average(int...array) {
		int sum = 0;
		int i = 0;
		for (int x : array) {
			sum += x;
			i++;
		}

		System.out.println("Average: " + (double) sum / i);
	}

	public static void anotherAverage(int y, boolean b, int... array) {
		int sum = 0;
		int i = 0;
		if (b)
			for (int x : array) {
				sum += x;
				i++;
			}
		System.out.println("Average: " + (double) sum / i);
		System.out.println("y: " + y);
	}

//	 public static void wrongAverage1(int... array, int y, boolean b,) {
//
//	 }

//	public static void wrongAverage2(int... intArray, boolean... booleanArray) {
//
//	}
}
