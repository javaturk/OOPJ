package org.javaturk.oopj.ch09.statik;

public class PovertyOfANewBieJavaProgrammer {

	static int i = 5;
	
	public static void main(String[] args) {
		System.out.println(i);
		
		f();
	}
	
	static void f() {
		System.out.println("Selam :)");
	}
}
