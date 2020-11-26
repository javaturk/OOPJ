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
public class ForEach {

	public static void main(String[] args) {

		Random r = new Random();
		int randomInt = Math.abs(r.nextInt());
		int size = randomInt % 100;
		System.out.println("Size is " + size);
		int[] intArray = new int[size];

		for (int i = 0; i < intArray.length; i++) {
			randomInt = r.nextInt();
			int sayi = randomInt % 100;
			intArray[i] = sayi;
		}

		for (int i : intArray)
			System.out.print(i + " ");

		System.out.println();
		
		// Following does not modify intArray's cells!
		for (int i : intArray) {
			randomInt = r.nextInt();
			int sayi = randomInt % 100;
			i = sayi;
		}
		
		for (int i : intArray)
			System.out.print(i + " ");
		
		System.out.println("\nAfter assigning all 10s");
		for (int i : intArray)
			i = 10;
		
		for (int i : intArray)
			System.out.print(i + " ");

		System.out.println();
		
		int sum = 0;
		for (int i : intArray)
			sum += i;

		System.out.println("Sum: " + sum);

		System.out.println("\nPizzas");
		Pizza[] pizzas = { new Pizza("Peynirli"), new Pizza("Sucuklu"), new Pizza("Sebzeli") };
		for (Pizza pizza : pizzas)
			System.out.println(pizza.name);
	}
}
