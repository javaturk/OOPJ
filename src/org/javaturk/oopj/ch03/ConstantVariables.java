package org.javaturk.oopj.ch03;

import org.javaturk.oopj.ch03.references.car.Car;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>  
 */
public class ConstantVariables {

	public static void main(String[] args) {

		final int i = 8;  // Constant variable
		System.out.println(i);

		// Illegal
//		 i = 7;
//		 i++;

		// Following is not illegal
		final long l; // Blank final but not a constant variable

		l = 7;
		
//		l = 8; // That's illegal
		System.out.println(l);
		
		final boolean b = !true;
		final int k = 1 * 2 * 3 * 4 * 5 * 6*1234567894;
		System.out.println("k: " + k);
		final float f = (float) (7 * Math.PI) / 2;
		final double d = 2.0 * Math.PI;
		
		final String s1 = "Java is good!"; // Constant variable!
		final String s2 = "The integer is" + 5;	// Constant variable!
		
		final String s3 = new String("Java is good!"); // Not a onstant variable!
		
//		Following is ok.
		int x = 3;
		int y = 8;
		final int j;  // Blank final but not a constant variable

		if (x > y)
			j = 9;
		else
			j = 11;

		System.out.println(i);
		
		final Car c1 = new Car();  // Not a constant variable
//		c1 = new Car();
		
		final Car c2; // Blank final, not a constant variable
		c2 = new Car();
//		c2 = new Car();
	}
}
