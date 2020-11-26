package org.javaturk.oopj.ch12.inheritance.substitutability;

public class SubstitutabilityExample {

	public static void main(String[] args) {

		Parent.f();
		Child.f();
		System.out.println(Parent.s);
//		System.out.println(Child.s);
		
		Parent parent = new Parent();
		parent.g();
		Child child = new Child();
		child.g();
		
		System.out.println(parent.i);
		System.out.println(parent.b);
//		System.out.println(child.i);
//		System.out.println(child.b);
	}

}
