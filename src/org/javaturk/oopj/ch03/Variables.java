package org.javaturk.oopj.ch03;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>  
 */
public class Variables {

	public static void main(String[] args) {
//		You can't use a variable if you don't declare it. You must define "i".
//		i = 5;

		// Declaring a variable
		int i;
		boolean b;
		String s1;
		
		// Do not use a variable before defining it!
//		 System.out.println(i + " " + b + " " + s1);
//		 int k = i;

		// Initializing a variable
		i = 8;
		b = false;
		s1 = new String("JavaTurk.org");

		// Only after they are defined can we use them!
		System.out.println("i: " + i + "\t b:" + b + "\t s1: " + s1);

		// Defining a variable
		int j = 18;
		float sin30 = 0.6f;
		String s2 = new String("Java :)");
		
		System.out.println("\nj: " + j + "\t sin30: " + sin30 + "\t s2: " + s2);
	}
}
