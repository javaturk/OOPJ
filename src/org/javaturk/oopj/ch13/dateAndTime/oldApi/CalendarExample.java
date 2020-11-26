/**
 * 
 */
package org.javaturk.oopj.ch13.dateAndTime.oldApi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * @author akin
 *
 */
public class CalendarExample {

	public static void main(String[] args) {
//		printCalendar();
		processCalendar();
	}


	public static void printCalendar() {
//		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
//		TimeZone timeZone = TimeZone.getTimeZone("Europe/Istanbul");
//		System.out.println("Calendar in " + timeZone.getDisplayName() + " time zone.");
		Calendar now = new GregorianCalendar();
//		now.setTimeZone(timeZone);
		System.out.println("ERA: " + now.get(Calendar.ERA));
		System.out.println("YEAR: " + now.get(Calendar.YEAR));
		System.out.println("MONTH: " + now.get(Calendar.MONTH));
		System.out.println("WEEK_OF_YEAR: " + now.get(Calendar.WEEK_OF_YEAR));
		System.out.println("WEEK_OF_MONTH: " + now.get(Calendar.WEEK_OF_MONTH));
		System.out.println("DATE: " + now.get(Calendar.DATE));
		System.out.println("DAY_OF_MONTH: " + now.get(Calendar.DAY_OF_MONTH));
		System.out.println("DAY_OF_YEAR: " + now.get(Calendar.DAY_OF_YEAR));
		System.out.println("DAY_OF_WEEK: " + now.get(Calendar.DAY_OF_WEEK));
		System.out.println("DAY_OF_WEEK_IN_MONTH: " + now.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("AM_PM: " + now.get(Calendar.AM_PM));
		System.out.println("HOUR: " + now.get(Calendar.HOUR));
		System.out.println("HOUR_OF_DAY: " + now.get(Calendar.HOUR_OF_DAY));
		System.out.println("MINUTE: " + now.get(Calendar.MINUTE));
		System.out.println("SECOND: " + now.get(Calendar.SECOND));
		System.out.println("MILLISECOND: " + now.get(Calendar.MILLISECOND));
		System.out.println("ZONE_OFFSET: " + (now.get(Calendar.ZONE_OFFSET) / (60 * 60 * 1000)));
		System.out.println("DST_OFFSET: " + (now.get(Calendar.DST_OFFSET) / (60 * 60 * 1000)));

		System.out.println("Current Time, with hour reset to 3");
		now.clear(Calendar.HOUR_OF_DAY); // so doesn't override
		now.set(Calendar.HOUR, 8);
		System.out.println("ERA: " + now.get(Calendar.ERA));
		System.out.println("YEAR: " + now.get(Calendar.YEAR));
		System.out.println("MONTH: " + now.get(Calendar.MONTH));
		System.out.println("WEEK_OF_YEAR: " + now.get(Calendar.WEEK_OF_YEAR));
		System.out.println("WEEK_OF_MONTH: " + now.get(Calendar.WEEK_OF_MONTH));
		System.out.println("DATE: " + now.get(Calendar.DATE));
		System.out.println("DAY_OF_MONTH: " + now.get(Calendar.DAY_OF_MONTH));
		System.out.println("DAY_OF_YEAR: " + now.get(Calendar.DAY_OF_YEAR));
		System.out.println("DAY_OF_WEEK: " + now.get(Calendar.DAY_OF_WEEK));
		System.out.println("DAY_OF_WEEK_IN_MONTH: " + now.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("AM_PM: " + now.get(Calendar.AM_PM));
		System.out.println("HOUR: " + now.get(Calendar.HOUR));
		System.out.println("HOUR_OF_DAY: " + now.get(Calendar.HOUR_OF_DAY));
		System.out.println("MINUTE: " + now.get(Calendar.MINUTE));
		System.out.println("SECOND: " + now.get(Calendar.SECOND));
		System.out.println("MILLISECOND: " + now.get(Calendar.MILLISECOND));
		System.out.println("ZONE_OFFSET: " + (now.get(Calendar.ZONE_OFFSET) / (60 * 60 * 1000))); // in
																										// hours
		System.out.println("DST_OFFSET: " + (now.get(Calendar.DST_OFFSET) / (60 * 60 * 1000))); // in

		System.out.println(now);
		
		Date date = now.getTime();             
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		String date1 = format1.format(date);  
		System.out.println("Date: " + date1);
	}
	
	private static void processCalendar() {
		Calendar calendar = new GregorianCalendar();

		Calendar now = new GregorianCalendar();
		print(now);

		// Add one month.
		now.add(Calendar.MONTH, 1);
		print(now);

		// Add 72 hours.
		now.add(Calendar.HOUR, 72);
		print(now);
		
		Calendar dob = new GregorianCalendar(2000, 3, 4, 14, 32, 58);
		print(dob);
		
		dob.add(Calendar.YEAR, -10);
		print(dob);
	}
	
	public static void print(Calendar calendar) {
		System.out.println("\nA date:");
		System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
		System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
		System.out.println("DATE: " + calendar.get(Calendar.DATE));
		System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
		System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
		System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
	}
}
