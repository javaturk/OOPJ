package org.javaturk.oopj.ch09.init.order;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class ClassInitializationOrder1 {

	public static void main(String[] args) {
//		ClassA a; // Doesn't cause anything because no part of the ClassA is reached.
//
//		System.out.println(ClassA.i);	// Causes the initialization of ClassA
//		
//		ClassA.printInfo(); // Causes the initialization of ClassA
		
//		new ClassA(); // Causes the initialization of ClassA and then calls the constructor.
	}
}

class ClassA {
	static int i = 5;

	private static double d1;
	private static String name = "JAVA";

	static {
		System.out.println("i: " + i);
		System.out.println("Initial value of d1: " + d1);
		d1 = Math.random() * 10;
		System.out.println("And now the value of d1: " + d1);
	}

	public ClassA() {
		System.out.println("\nStarting ClassA()");
		System.out.println("The value of d1: " + d1);
		d1 = Math.random() * 10;
		System.out.println("And now the value of d1: " + d1);
		
		System.out.println("The value of d2: " + d2);
		d2 = Math.random() * 100;
		System.out.println("And now the value of d2: " + d2);
		System.out.println("Ending ClassA()");
	}

	static void printInfo() {
		System.out.println("\nInfo");
		System.out.println("i: " + i +  " d1: " + d1 +  " d2: " + d2);
	}
	
	private static double d2;

	static {
		System.out.println("Initial value of d2: " + d2);
		d2 = Math.random() * 100;
		System.out.println("And now the value of d2: " + d2);
	}

	public static String init() {
		System.out.println("in init()");
		return "55";
	}
}
