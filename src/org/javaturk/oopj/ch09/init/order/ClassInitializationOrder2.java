package org.javaturk.oopj.ch09.init.order;

public class ClassInitializationOrder2 {
	public static void main(String[] args) {
		System.out.println("ClassAA.i: " + ClassAA.i);
		System.out.println("ClassAA.j: " + ClassAA.j);
		System.out.println("ClassAA.s: " + ClassAA.s);
		System.out.println(ClassAA.CONSTANT);	// Causes the initialization of ClassAA
//		ClassAA.printInfo();

//		a = new ClassAA();
	}
}

class ClassAA {

	static final int i = 11;
	static final int j = 14;
	static final String s = "Java";
//	static int i = 21;
//	static int j = 14;
//	static String name = "Java";

	static {
		System.out.println("in static initializer block of ClassAA - 1");
		System.out.println("i: " + i);
		System.out.println("j: " + j);
	}

	public static final String CONSTANT = s;
//	public static final String CONSTANT = name;
	static {
//		i = 1;
//		CONSTANT = "selam";  // Can't do it.
		System.out.println("CONSTANT: " + CONSTANT); // Can't reach its value when it is not explicitly initialzied!
	}

	public ClassAA() {
		System.out.println("in ClassAA()");
	}

	static String name = "ClassInitializationOrder2";

	static {
		System.out.println("in static initializer block of ClassAA - 2");
	}

	static void printInfo() {
		System.out.println("\nInfo");
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("s: " + s);
	}
}
