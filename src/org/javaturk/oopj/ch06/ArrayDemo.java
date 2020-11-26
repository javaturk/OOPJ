
package org.javaturk.oopj.ch06;

import java.util.Random;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class ArrayDemo {

	static int[] intArray = new int[10];
	static Pizza pizzas[] = new Pizza[3];
	static boolean[] flags = { true, false };

	public static void main(String[] args) {
		initializeArrays();
//		printArrays();
		problems();
	}

	public static void initializeArrays() {
		System.out.println("\nInitializing Arrays");

		Random r = new Random();
		for (int i = 0; i < intArray.length; i++) {
			int randomInt = r.nextInt();
			int sayi = randomInt % 100;
			intArray[i] = sayi;
		}

		pizzas[0] = new Pizza("Peynirli");
		pizzas[1] = new Pizza("Sucuklu");
		pizzas[2] = new Pizza("Sebzeli");

//		flags = { true, false }; // Can't do that.
	}

	public static void printArrays() {

		System.out.println("Printing arrays");

		for (int i = 0; i < intArray.length; i++)
			System.out.print(intArray[i] + " ");
		
		System.out.println();

		System.out.println("Pizzas: " + pizzas[0].name + " " + pizzas[1].name + " " + pizzas[2].name);

		Pizza p = pizzas[0];
		System.out.println("Pizzas: " + p.name);
		
		System.out.println("\nFifth element of intArray is " + intArray[4]);
		System.out.println("First element of flags is " + flags[0]);
		System.out.println("Name of the last element of pizzalar is " + pizzas[2].name);
	}

	public static void problems() {
		System.out.println("\nProblems!");

		// Negative array size causes NegativeArraySizeException!
//		int arrayLength = -5;
//		short[] shorty = new short[arrayLength];

//		Negative index causes ArrayIndexOutOfBoundsException
//		Pizza pizza = pizzas[-2];
//		Pizza pizza = pizzas[4];

//		long index can't be used
//		long l = 5;
//		Pizza pizza = pizzas[l]; 

		// This is OK
//		short s = 2;
//		Pizza pizza2 = pizzas[s];
//		System.out.println(pizza2.name);

		// Following is a problem: i <= pizzas.length
		Pizza pizza1 = null;
		for (int i = 0; i < pizzas.length; i++)
			pizza1 = pizzas[i];
	}
}

class Pizza {
	String name;

	Pizza(String name) {
		this.name = name;
	}
}
