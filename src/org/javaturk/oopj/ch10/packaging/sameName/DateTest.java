package org.javaturk.oopj.ch10.packaging.sameName;

public class DateTest {

	public static void main(String[] args) {

		Date date = new Date(); // Refers to the class in the same package
		
		java.util.Date javaDate = new java.util.Date();
		
		java.sql.Date sqlDate = new java.sql.Date(0);
	}
}
