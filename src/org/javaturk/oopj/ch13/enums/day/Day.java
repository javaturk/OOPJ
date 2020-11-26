package org.javaturk.oopj.ch13.enums.day;

public enum Day{
	 SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

	public static void main(String[] args) {

		String nameOfDay = Day.FRIDAY.name();
		System.out.println(nameOfDay);

		int ordinal = Day.TUESDAY.ordinal();
		System.out.println(ordinal);

		Day[] days = Day.values();
		for (Day day : days)
			System.out.println(day);
		
		System.out.println("toString() of Day.MONDAY: " + Day.MONDAY.toString());
		
		boolean b1 = Day.MONDAY == Day.MONDAY;
		System.out.println("Day.MONDAY == Day.MONDAY: " + b1);
		
		boolean b2 = Day.MONDAY == Day.SUNDAY;
		System.out.println("Day.MONDAY == Day.SUNDAY: " + b2);
	}
}