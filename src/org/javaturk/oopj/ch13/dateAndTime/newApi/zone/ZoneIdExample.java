package org.javaturk.oopj.ch13.dateAndTime.newApi.zone;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdExample {

	public static void main(String[] args) {
		listZoneIds();
		
		System.out.println();
		
		ZoneId defaulZoneId = ZoneId.systemDefault();
		System.out.println("Default Zone Id: " + defaulZoneId);
	}
	
	public static void listZoneIds() {
		Set<String> zoneIds = ZoneId.getAvailableZoneIds();
		for(String zoneId : zoneIds)
			System.out.println("Zone Id: " + zoneId);
	}
}
