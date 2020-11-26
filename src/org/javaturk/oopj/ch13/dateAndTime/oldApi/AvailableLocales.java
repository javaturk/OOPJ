package org.javaturk.oopj.ch13.dateAndTime.oldApi;

import java.text.DateFormat;
import java.util.Locale;

public class AvailableLocales {
	private static Locale turkishLocale;

	static public void main(String[] args) {
		System.out.println("All available locales:");
		Locale locales[] = DateFormat.getAvailableLocales();
		System.out.println("Number of all locales: " + locales.length);
		for (Locale aLocale : locales) {
			System.out.println(aLocale.toString());
			if (aLocale.toString().startsWith("tr"))
				turkishLocale = aLocale;
		}
		
		System.out.println("  * * *  * * *  ");
		System.out.println("Turkish locale: " + turkishLocale.toString());
		System.out.println("Country: " + turkishLocale.getCountry());
		System.out.println("Language: " + turkishLocale.getLanguage());
	}
}
