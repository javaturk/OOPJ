package org.javaturk.oopj.ch13.string;

public class StringJoin {

	public static void main(String[] args) {
		String names1 = String.join(" and ", "Ali", "Veli", "49", "50");
        System.out.println(names1);

        String[] names2 = {"Ayse", "Fatma", "Nuriye"};
        String nameList = String.join(", ",names2);
        System.out.println(nameList);
	}
}
