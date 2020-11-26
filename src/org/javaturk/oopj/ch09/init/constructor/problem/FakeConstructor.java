package org.javaturk.oopj.ch09.init.constructor.problem;

public class FakeConstructor {
	
	FakeConstructor() {
		System.out.println("in FakeConstructor");
	}
	
	void FakeConstructor() {
		System.out.println("in FakeConstructor method");
	}
	
	public static void main(String[] args) {
		FakeConstructor ref = new FakeConstructor();
		ref.FakeConstructor();
	}
}
