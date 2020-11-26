package org.javaturk.oopj.ch09.statik;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class StaticDemo {
	static int i = 10;
	int j = 10;
	
	public static void main(String args[]) {
		System.out.println("StaticDemo.i: " + i);
		System.out.println("StaticDemo.i: " + StaticDemo.i);
		
		StaticDemo.increment();

		System.out.println("StaticDemo.i: " + StaticDemo.i);

		StaticDemo st1 = new StaticDemo();
		StaticDemo st2 = new StaticDemo();

		// Unethical access :)
		System.out.println("st1.i: " + st1.i);
		System.out.println("st2.i: " + st2.i);
		
		StaticDemo.increment();

		// Unethical access :)
		st1.increment();
		st2.increment();

		System.out.println("st1.i: " + st1.i);
		System.out.println("st2.i: " + st2.i);
		System.out.println("StaticDemo.i: " + StaticDemo.i);
		System.out.println("StaticDemo.i: " + i);
		
		// Direct access
		setI(22);
		aMethod();
		
//		StaticDemo.setI(25);
//		StaticDemo.aMethod();
	}

	 static void increment() {
		i++;
		aMethod();
	}
	
	static void aMethod() {
		increment();
		int i = 7;
		System.out.println("Local i: " + i);
		System.out.println("StaticDemo's i: " + StaticDemo.i);
	}
	
	static void setI(int i) {
		StaticDemo.i = i;
	}
}