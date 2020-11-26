package org.javaturk.oopj.ch13.singleFile.selam2;

import java.time.LocalDate;

/**
 * #!/usr/local/bin/java --source 11
 * 
 * @author Akin Kaldiroglu (akin.kaldiroglu@selsoft.com.tr)
 *
 */
public class SelamTest {

	public static void main(String[] args) {
		Greeting greeting = new Selamlama();
		String selamlama = greeting.greet("Zeynep");
		System.out.println(selamlama);
		System.out.println("Date: " + LocalDate.now());
	}
}

class Selamlama extends Greeting {

	@Override
	public String greet(String whom) {
		String greeting = "Selam " + whom + " :)";
		return greeting;
	}
}

class Greeting {

	public String greet(String whom) {
		return null;
	}
}
