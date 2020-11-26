package org.javaturk.oopj.ch09.statik;

import java.util.Date;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Citizen {
	String tckn;
	String firstName;
	String lastName;
	Date dateOfBirth;
	String placeOfBirth;
	char sex;
	
	String fatherName;
	String motherName;
	
	static String nationality;
	
	static String getNationality() {
		return nationality;
	}
	
	public static void main(String[] args) {
		Citizen c1 = new Citizen();
		c1.tckn = "11111111111";
		c1.firstName = "Mehmet";
		c1.lastName = "Telli";
		
		Citizen c2 = new Citizen();
		c2.tckn = "22222222222";
		c2.firstName = "Selin";
		c2.lastName = "Merakli";
		
		Citizen.nationality = "Turkiye Cumhuriyeti";
		
		System.out.println("Nationality: " + Citizen.nationality);
		System.out.println("Mehmet's nationality: " + c1.nationality);
		System.out.println("Selin's nationality: " + c2.nationality);
		
		Citizen.nationality = "Azerbaycan Respublikasi";
		c1.nationality = "Azerbaycan Respublikasi";
		c2.nationality = "Azerbaycan Respublikasi";
		
		System.out.println("\nNationality: " + Citizen.nationality);
		System.out.println("Mehmet's nationality: " + c1.nationality);
		System.out.println("Selin's nationality: " + c2.nationality);
		
		System.out.println("\nNationality: " + Citizen.getNationality());
		System.out.println("Mehmet's nationality: " + c1.getNationality());
		System.out.println("Selin's nationality: " + c2.getNationality());
	}
}
