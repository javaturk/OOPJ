
package org.javaturk.oopj.ch13.dateAndTime.oldApi;

import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class TimeZoneExample {

	public static void main(String[] args) {
		System.out.println("All available time zones:");
		String timeZones[] = TimeZone.getAvailableIDs();
		System.out.println("Number of all time zones: " + timeZones.length);
		for (String timeZone : timeZones) {
			System.out.println(timeZone.toString());
		}

		System.out.println("\nDefault time zone:");
		TimeZone defaultTimeZone = TimeZone.getDefault();
		System.out.println(defaultTimeZone.getID());
		System.out.println(defaultTimeZone.getDisplayName());
		Date date = new Date();
		System.out.println("date: " + date);
		System.out.println("Daylight time: " + defaultTimeZone.inDaylightTime(date));
		Locale trLocale = new Locale("tr");
		System.out.println(defaultTimeZone.getDisplayName(trLocale));
	}
}
