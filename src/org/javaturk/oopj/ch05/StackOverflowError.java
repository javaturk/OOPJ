package org.javaturk.oopj.ch05;

public class StackOverflowError {
	static int i;

	public static void main(String[] args) {
		main(null);
	}

//	public static void main(String[] args) {
//		i++;
//		try{
//			main(null);
//		}
//		catch(java.lang.StackOverflowError e) {
//			System.out.println(e);
//			System.out.println(e.getMessage());
//			System.out.println(i);
//		}
//	}
}
