
package org.javaturk.oopj.ch13.enums.date;

public class Date1 {
	
	private int dayOfMonth;
	private int month;
	private int year;

	public Date1(int dayOfMonth, int month, int year) {
		this.dayOfMonth = dayOfMonth;
		this.month = month;
		this.year = year;
		
		if(dayOfMonth < 0 | dayOfMonth > 31)
			System.out.println("Bu ne? Day of month: " + dayOfMonth);
			
	}
}
