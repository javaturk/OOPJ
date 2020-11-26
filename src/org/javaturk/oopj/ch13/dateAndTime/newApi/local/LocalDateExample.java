package org.javaturk.oopj.ch13.dateAndTime.newApi.local;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Today: " + today);
		
		System.out.println();
		
		System.out.println("Day of month: " + today.getDayOfMonth());
		System.out.println("Day of week: " + today.getDayOfWeek());
		System.out.println("Day of year: " + today.getDayOfYear());
		
		System.out.println();
		
		System.out.println("Year " + today.getYear());
		System.out.println("Month: " + today.getMonth());
		System.out.println("Is leap year: " + today.isLeapYear());
		
		System.out.println();
		
		LocalDate tomorrow = today.plusDays(1);
		System.out.println("Tomorrow: " + tomorrow);
		
		LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
		System.out.println("Previous Month Same Day: " + previousMonthSameDay);
		
		LocalDate oneHundredYearsAgoSameDay = LocalDate.now().minus(100, ChronoUnit.YEARS);
		System.out.println("One Hundred Years Ago Same Day: " + oneHundredYearsAgoSameDay);
		System.out.println("It is " + oneHundredYearsAgoSameDay.getDayOfWeek());
		
		System.out.println();
		
		LocalDate date1 = LocalDate.of(1968, 3, 17);
		System.out.println("Date1: " + date1);
		
		date1 = LocalDate.of(1968, Month.MARCH, 17);
		System.out.println("Date1: " + date1);
		
		date1 = date1.plusDays(10_000);
		System.out.println("Date1: " + date1);
		
		date1 = date1.plusYears(20);
		System.out.println("Date1: " + date1);
		
		LocalDate date2 = LocalDate.parse("2019-02-14");
		System.out.println("\nDate2: " + date2);
	}
}
