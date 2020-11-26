
package org.javaturk.oopj.ch13.dateAndTime.oldApi;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarAndDateExample {
	public static void main(String[] args) {
		Date date1 = new Date(-1_000_000_000_000L);
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date1);
		System.out.println(calendar.get(Calendar.DATE) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.YEAR));
		System.out.println("Date: " + date1);
		
		date1 = new Date(0);
		calendar.setTime(date1);
		System.out.println("\n" + calendar.get(Calendar.DATE) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.YEAR));
		System.out.println("Date: " + date1);
		
		// Add one month.
		calendar.add(Calendar.YEAR, 1);
		System.out.println("\nAfter one year:");
		System.out.println(calendar.get(Calendar.DATE) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.YEAR));
		Date date3 = calendar.getTime();
		System.out.println("Date: " + date3);
	}
}
