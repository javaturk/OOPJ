package org.javaturk.oopj.ch12.inheritance.hiding;

public class StaticOverridingExample {

	public static void main(String[] args) {
		Parent.g();
		Child.g();
		
		Parent p = new Child(0, false, 0, (byte) 0,  0);
//		p.g();
//		p.f();
	}
}
