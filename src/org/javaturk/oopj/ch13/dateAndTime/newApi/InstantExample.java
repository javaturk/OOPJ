package org.javaturk.oopj.ch13.dateAndTime.newApi;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantExample {

	public static void main(String[] args) {
		Instant timestamp = Instant.now();
		System.out.println("Now: " + timestamp);
		System.out.println("Epoch seconds: " + timestamp.getEpochSecond());
		System.out.println("Nanoseconds: " + timestamp.getNano());
		
		Instant later = timestamp.plusSeconds(1_000_000);
		System.out.println("1_000_000 second later: " + later);
		
		ZonedDateTime timeStanpInChicago = timestamp.atZone(ZoneId.of("America/Chicago"));
		System.out.println("Now in Chicago: " + timeStanpInChicago);
		
	}
}
