package org.javaturk.oopj.ch13.enums.size;

enum Size {
	SMALL("S", 1), MEDIUM("M", 2), LARGE("L", 3), EXTRA_LARGE("XL", 4);

	private String abbreviation;
	private int no;

	private static String description;
	private static int count;

	static {
		System.out.println("in static initializer block");
		description = "These are sizes.";
	}

	{
//		 count++: // can't do this!
		System.out.println("in object initializer block");
	}

	Size(String abbreviation, int no) {
		this.abbreviation = abbreviation;
		this.no = no;
//		count++: // can't do this!
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public int getNo() {
		return no;
	}

	public static String getDescription() {
		return description;
	}
}