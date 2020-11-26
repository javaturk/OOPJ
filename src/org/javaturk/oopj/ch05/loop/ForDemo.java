package org.javaturk.oopj.ch05.loop;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      This is an example about unary operators.
 */
public class ForDemo {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 100; i++)
			sum += i;
		System.out.println("Sum: " + sum);

		System.out.println("\nMultiplication Table");

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.format("%4d", i * j);
			}
			System.out.println();
		}

		System.out.println("\nFiboniacci Numbers");

		int f0 = 1;
		int f1 = 1;
		int fibonacciNumber;

		System.out.format("%8d", f0);
		System.out.format("%8d", f1);
		for (int i = 3; i <= 30; i++) {
			fibonacciNumber = f0 + f1;
			System.out.format("%8d", fibonacciNumber);
			f0 = f1;
			f1 = fibonacciNumber;
			if (i % 10 == 0)
				System.out.println();
		}

		System.out.println("\nA Little Bir Complicated For Loop");

		for (int i = 1, j = i + 10; (i < 5 & j > 2); i++, j = i * 2) {
			System.out.println("i= " + i + " j= " + j);
		}

//		That's error!
//		for (int i = 1, long j = i + 10; (i < 5 & j > 2); i++, j = i * 2) {
//			System.out.println("i= " + i + " j= " + j);
//		}
		
		int t = 7;
		for (; t < 8; t += 2)
			System.out.println(t + "*");

		System.out.println(t);
		
		System.out.println();

		// Does not go into for loop
		for (int k = 8; k < 8; k++) {
			System.out.println("k: " + k);
		}

		// Following for is ok but causes dead code.
		int i = 0;
		for (;;) {
			System.out.println(i);
			if (true)
				break;
			i++; // This is dead code.
		}
		
//		double r = Math.random();
//        System.out.println("r: " + r);
        for (;;) {
        	double r = Math.random();
        	if(r < 0.8d)
        		break;
        	System.out.println(r);
        }
	}
}
