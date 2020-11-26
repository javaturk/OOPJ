package org.javaturk.oopj.ch13.dateAndTime.newApi.zone;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String[] args) {
		
		ZonedDateTime nowInIstanbul = ZonedDateTime.now();
		System.out.println("Now in Istanbul: " + nowInIstanbul);
		System.out.println("Zone Id: " + nowInIstanbul.getZone());
		
		
		ZonedDateTime nowInParis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("Now in Paris: " + nowInParis);
		
		
		ZonedDateTime nowInChicago = ZonedDateTime.now(ZoneId.of("America/Chicago"));
		System.out.println("Now in Chicago: " + nowInChicago);
		
		
	}
}
