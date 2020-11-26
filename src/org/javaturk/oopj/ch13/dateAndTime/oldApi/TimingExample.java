
package org.javaturk.oopj.ch13.dateAndTime.oldApi;

import java.time.Clock;

/**
 * @author akin
 *
 */
public class TimingExample {
	public static void main(String[] args) throws InterruptedException {
//		measurePeriod();
		measurePeriod(1000); 
	}
	
	public static void measurePeriod() {
		long start, end;
		int[] a = new int[100_000_000];
		int[] b = new int[100_000_000];
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		start = System.currentTimeMillis();
		for (int j = 0; j < a.length; j++) {
			b[j] = a[j];
		}
		end = System.currentTimeMillis();
		System.out.println(end - start + " milli seconds for loop copy.");
		start = System.currentTimeMillis();
		System.arraycopy(a, 0, b, 0, b.length);
		end = System.currentTimeMillis();
		System.out.println(end - start + " milli seconds for System.arraycopy().");
	}
	
	public static void measurePeriod(int milisecond) throws InterruptedException{
		System.out.println("Measured period: " + milisecond + " ms.");
		long start = System.currentTimeMillis();  
		Thread.sleep(milisecond);
		long end = System.currentTimeMillis();
		System.out.println("Time period: " + (end - start));
	}
}
