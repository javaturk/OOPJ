package org.javaturk.oopj.ch05.decision;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      This is an example that shows arithmetic promotions made in operators.
 */
public class TernaryOperatorDemo {

	public static void main(String[] args) {
		double random = Math.random();

		System.out.println("random: " + random);
		String para = random > 0.5 ? "Tura" : "Yazı";
		System.out.println(para);

		if (random > 0.5)
			para = "Tura";
		else
			para = "Yazı";
		System.out.println(para);

		int x = 5;
		int y = 2;

		int bigger = x > y ? x : y;

		System.out.println(bigger);

		if (x > y)
			bigger = x;
		else
			bigger = y;

		// More complicated example
		x = (int) (Math.random() * 1000);
		y = (int) (Math.random() * 1000);
		int z = (int) (Math.random() * 1000);
		boolean b;
		System.out.println("x: " + x + " y: " + y + " z: " + z);
		if (b = x < y ? x < z ? true : false : false)
			System.out.println("x is smaller than both y and z at the same time.");
		else
			System.out.println("x is not smaller than y");
	}
}
