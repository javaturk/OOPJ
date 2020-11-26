package org.javaturk.oopj.ch13.dateAndTime.newApi;

import java.time.Clock;

public class ClockExample {

	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 0; i < 10; i++) 
			getLapseTime();
	}
	
	public static void getLapseTime() throws InterruptedException {
		Clock clock = Clock.systemDefaultZone();
		long start = clock.millis();
//		System.out.println("Now in mili seconds: " + start);
		
		Thread.sleep(1_000);
		
		long stop = clock.millis();
		long lapseTimeInMilisecond = stop - start;
		
		System.out.println("Lapse time in mili seconds: " + lapseTimeInMilisecond);
	}

}
