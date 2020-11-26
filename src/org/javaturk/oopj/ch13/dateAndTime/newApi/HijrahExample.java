package org.javaturk.oopj.ch13.dateAndTime.newApi;

import java.text.SimpleDateFormat;
import java.time.chrono.HijrahDate;
import java.time.temporal.ChronoField;

public class HijrahExample {

	public static void main(String[] args) {

		HijrahDate today = HijrahDate.now();
		System.out.println("Now in Hijrah: " + today);
		
		System.out.println(today.getEra());
		System.out.println("Year: " + today.get(ChronoField.YEAR));
		System.out.println("Month: " + today.get(ChronoField.MONTH_OF_YEAR));
		System.out.println("Day of Month: " + today.get(ChronoField.DAY_OF_MONTH));
		System.out.println("Day of Week: " + today.get(ChronoField.DAY_OF_WEEK));
		
//		System.out.println(new SimpleDateFormat("MMMMMMM").format(today.get(ChronoField.DAY_OF_MONTH)));
	}
}
