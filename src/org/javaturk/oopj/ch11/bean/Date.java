
package org.javaturk.oopj.ch11.bean;

/**
 * That's a bean.
 * @author akin
 *
 */
public class Date {
	private int dayOfMonth;
	private int month;
	private int year;
	
	public Date(){
	}

	public int getDayOfMonth() {
		return dayOfMonth;
	}

	public void setDayOfMonth(int dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
