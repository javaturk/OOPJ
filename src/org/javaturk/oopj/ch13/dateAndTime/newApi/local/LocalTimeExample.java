package org.javaturk.oopj.ch13.dateAndTime.newApi.local;

import java.time.LocalTime;

public class LocalTimeExample {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		System.out.println("Hour: " + now.getHour());
		System.out.println("Minute " + now.getMinute());
		System.out.println("Second: " + now.getSecond());
		System.out.println("Nano second: " + now.getNano());
	}
}
