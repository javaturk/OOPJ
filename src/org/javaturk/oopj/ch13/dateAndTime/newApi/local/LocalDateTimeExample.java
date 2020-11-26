package org.javaturk.oopj.ch13.dateAndTime.newApi.local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		
		LocalDateTime todayNow = LocalDateTime.now();
		System.out.println(todayNow);
	}
}
