package org.javaturk.oopj.ch13.dateAndTime.newApi.zone;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneOffsetExample {

	public static void main(String[] args) {
		OffsetDateTime nowInIstanbul = OffsetDateTime.now();
		System.out.println("Now in Istanbul: " + nowInIstanbul);
		
		ZoneOffset istanbulOffset = nowInIstanbul.getOffset();
		System.out.println("Offset of Istanbul: " + istanbulOffset);
	}
}
