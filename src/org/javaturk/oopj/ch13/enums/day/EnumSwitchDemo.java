package org.javaturk.oopj.ch13.enums.day;

public class EnumSwitchDemo {
	Day day;

	public EnumSwitchDemo(Day day) {
		this.day = day;
	}

	public void tellItLikeItIs() {
		String message = switch (day) {
			case MONDAY -> "Mondays are bad.";
			case FRIDAY -> "Fridays are better.";
			case SATURDAY, SUNDAY -> "Weekends are best.";
			default ->	"Midweek days are so-so.";
		};
		
		System.out.println(message);
	}

	public static void main(String[] args) {
		EnumSwitchDemo firstDay = new EnumSwitchDemo(Day.MONDAY);
		firstDay.tellItLikeItIs();
		EnumSwitchDemo thirdDay = new EnumSwitchDemo(Day.WEDNESDAY);
		thirdDay.tellItLikeItIs();
		EnumSwitchDemo fifthDay = new EnumSwitchDemo(Day.FRIDAY);
		fifthDay.tellItLikeItIs();
		EnumSwitchDemo sixthDay = new EnumSwitchDemo(Day.SATURDAY);
		sixthDay.tellItLikeItIs();
		EnumSwitchDemo seventhDay = new EnumSwitchDemo(Day.SUNDAY);
		seventhDay.tellItLikeItIs();
	}
}
