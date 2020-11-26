package org.javaturk.oopj.ch13.dateAndTime.newApi;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Today: " + today);
		
		LocalDate myBirthDay = LocalDate.of(1968, 3, 17);
		System.out.println("My Birth Day: " + myBirthDay);
		
		Period period = today.until(myBirthDay);
		System.out.println("I am exactly " + period + " old.");
		
		System.out.println("");
		
		LocalDate start = LocalDate.of(1994, 11, 11);
		System.out.println("Start: " + start);
		
		period = Period.between(today, start);
		System.out.println("Period: " + period);
		
		period = Period.ofDays(3650);
		System.out.println("Period: " + period);
		
		Period normalizedPeriod = period.normalized();
		System.out.println("Period: " + normalizedPeriod.getYears());
		System.out.println("Period: " + normalizedPeriod.getMonths());
		
		period = Period.ofMonths(35);
		System.out.println("Period: " + period);
		normalizedPeriod = period.normalized();
		System.out.println("Period: " + normalizedPeriod.getYears());
		System.out.println("Period: " + normalizedPeriod.getMonths());
	}
}
